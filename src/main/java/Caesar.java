import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String str2 = "";
        for (int i = 0; i < message.length(); i++){
            if ((message.charAt(i) >= 65 && message.charAt(i) <= 90)){
                int a = ((message.charAt(i) - 62) % 26) + 65;
                str2 += (char)(a);
            }
            else if ((message.charAt(i) >= 97 && message.charAt(i) <= 122)){
                int a = ((message.charAt(i) - 94) % 26) + 97;
                str2 += (char)(a); 
            }
            else {
                str2 += message.charAt(i);
            }
            
        }
        return str2;
        
    }

    public static String decryptCaesar(String message) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
