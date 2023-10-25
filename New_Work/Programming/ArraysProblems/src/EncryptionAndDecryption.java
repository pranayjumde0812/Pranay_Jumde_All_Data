import java.util.Scanner;

public class EncryptionAndDecryption {

    public String encryptMessage(String message) {

        String encryptedMessage = "";

        char[] msg = message.toCharArray();

        for (int i = 0; i < msg.length; i++) {

            int code = (msg[i] + (msg[i] % 10));
            if (i == msg.length - 1) {
                encryptedMessage = encryptedMessage + code;
            } else {
                encryptedMessage = encryptedMessage + code + "-";
            }
        }

        return encryptedMessage;
    }

    public String decryptMessage(String encryptedMessage) {

        String decryptedMessage = "";
        /////////////////////////////////////////////////////////

        String[] arr = encryptedMessage.split("-");

        char[] narr = new char[arr.length];
        for (int i = 0; i < narr.length; i++) {
            String temp = arr[i];
            int j = Integer.parseInt(temp);
            System.out.print(j);
            narr[i] = (char) (j - (j % 10));
            System.out.print(narr[i]);
        }

        for (int j = 0; j < narr.length; j++) {
            decryptedMessage = decryptedMessage + narr[j];
        }
        return decryptedMessage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        EncryptionAndDecryption en = new EncryptionAndDecryption();
        String encryptedMessage = en.encryptMessage(message);
        System.out.println(encryptedMessage);

        String decryptedMessage = en.decryptMessage(encryptedMessage);
        System.out.println(decryptedMessage);
    }
}
