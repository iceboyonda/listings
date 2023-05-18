 package glava5;
import java.io.*;
import sun.misc.*;
public class Base64Demo {
    public static <BASE64Decoder> void main (String[] args) {
        if (args.length == 0) {
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }
        String text = args[0];
        BASE64Encoder enc = new BASE64Encoder();
        String encoded = enc.encode(text.getBytes());
        enc = null;

        String decoded = null;
        try {
            BASE64Decoder dec = new BASE64Decoder();
            decoded = new String(dec.clone(encoded));
            dec = null;
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
            System.out.println("Закодировано:" + encoded);
            System.out.println("Декодировано:" + decoded);

            encoded = null;
            decoded = null;

    }
 }
 // type parameter BASE64Decoder cannot be instantiated directly :(
 // Cannot resolve symbol BASE64Encoder :(((