package data_types;

public class Encode {
    public static String enc(String msg, String key) {
        String encodeMsg = "";
        String decodeMsg = "";

        for (int i = 0, j = 0; i < msg.length(); i++, j++) {
            if (j == key.length() - 1) {
                j -= key.length() - 1;
            }
            encodeMsg = encodeMsg + (char) (msg.charAt(i) ^ key.charAt(j));
        }

        for (int i = 0, j = 0; i < encodeMsg.length(); i++, j++) {
            if (j == key.length() - 1) {
                j -= key.length() - 1;
            }
            decodeMsg = decodeMsg + (char) (encodeMsg.charAt(i) ^ key.charAt(j));
        }
        return decodeMsg;
    }
}