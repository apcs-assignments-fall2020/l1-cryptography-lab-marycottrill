import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String str2 ="";
        String key2 = key.toUpperCase();
        int key_len= key.length();
        int b = 0;
        for( int i = 0 ; i < message.length(); i++){
            if (message.charAt(i) >= 65 && message.charAt(i) <= 90){
                int a = ((message.charAt(i) + (key2.charAt(b)-65) - 65) % 26) + 65;
                str2 += (char)(a);
                b = (b + 1) % key_len;
            }
            else if (message.charAt(i) >= 97 && message.charAt(i) <= 122){
                int a = ((message.charAt(i) + (key2.charAt(b)-65) - 97) % 26) + 97;
                str2 += (char)(a);
                b = (b + 1) % key_len;
            } 
            else{
                str2 += message.charAt(i);
            }  
        }
        return str2;
    }

    public static String decryptVigenere(String message, String key) {
        String str2 ="";
        String key2 = key.toUpperCase();
        int key_len= key.length();
        int b = 0;
        for( int i = 0 ; i < message.length(); i++){
            if (message.charAt(i) >= 65 && message.charAt(i) <= 90){
                int a = ((message.charAt(i) - (key2.charAt(b)+65) + 195) % 26) + 65;
                str2 += (char)(a);
                b = (b + 1) % key_len;
            }
            else if (message.charAt(i) >= 97 && message.charAt(i) <= 122){
                int a = ((message.charAt(i) - (key2.charAt(b)-65) + 163) % 26) + 97;
                str2 += (char)(a);
                b = (b + 1) % key_len;
            } 
            else{
                str2 += message.charAt(i);
            }  
        }
        return str2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
