public class XORCipherDecoder {

    public static void main(String[] args) {
        // Hexadecimal string of the XOR ciphertext
        String hexCiphertext = "1d0e1a0f3e0b021b132c201225252e361228132132232a291a31283d3b20362316233523223a2531363e34";

        // Convert the hex string to a byte array
        byte[] ciphertext = hexStringToByteArray(hexCiphertext);

        // Try all possible single-byte keys (0-255)
        for (int key = 0; key < 256; key++) {
            byte[] plaintext = xorDecrypt(ciphertext, (byte) key);
            String decodedText = new String(plaintext);

            // Print potential plaintexts
            System.out.printf("Key: 0x%02X -> %s\n", key, decodedText);
        }
    }

    // Convert a hexadecimal string to a byte array
    private static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    // XOR decrypts the byte array using a single-byte key
    private static byte[] xorDecrypt(byte[] data, byte key) {
        byte[] result = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = (byte) (data[i] ^ key);
        }
        return result;
    }
}
