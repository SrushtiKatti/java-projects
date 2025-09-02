
import java.util.ArrayList;
import java.util.Scanner;

public class EncryptionToolv1 {
    private static ArrayList<String> history = new ArrayList<>();
    private static int encryptCount = 0;
    private static int decryptCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Encrypt Message");
            System.out.println("2. Decrypt Message");
            System.out.println("3. Try Sample Demo");
            System.out.println("4. Show History");
            System.out.println("5. Show Summary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    encryptMessage(sc);
                    break;
                case 2:
                    decryptMessage(sc);
                    break;
                case 3:
                    demoMode();
                    break;
                case 4:
                    showHistory();
                    break;
                case 5:
                    showSummary();
                    break;
                case 6:
                    clearHistroy();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you for using Encryption Tool!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }

    // ---------- Feature Functions ----------
    private static void encryptMessage(Scanner sc) {
        System.out.print("Enter message to encrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter key (number): ");
        int key = sc.nextInt();
        sc.nextLine();

        String encrypted = caesarCipher(message, key);
        System.out.println("Encrypted Message: " + encrypted);

        history.add("Encrypted: " + message + " -> " + encrypted);
        encryptCount++;
    }

    private static void decryptMessage(Scanner sc) {
        System.out.print("Enter message to decrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter key (number): ");
        int key = sc.nextInt();
        sc.nextLine();

        String decrypted = caesarCipher(message, -key);
        System.out.println("Decrypted Message: " + decrypted);

        history.add("Decrypted: " + message + " -> " + decrypted);
        decryptCount++;
    }

    private static void demoMode() {
        String sample = "Srushti 123";
        int key = 3;
        String encrypted = caesarCipher(sample, key);
        String decrypted = caesarCipher(encrypted, -key);

        System.out.println("Demo Sample:");
        System.out.println("Original: " + sample);
        System.out.println("Encrypted (key=3): " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    private static void showHistory() {

        System.out.println("History:");
        if (history.isEmpty()) {
            System.out.println("No operations yet.");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }

    private static void showSummary() {
        System.out.println("Summary:");
        System.out.println("Messages Encrypted: " + encryptCount);
        System.out.println("Messages Decrypted: " + decryptCount);
    }
    private static void clearHistroy(){
        history.clear();
        System.out.println("History Cleared Successfully");
    }

    // ---------- Caesar Cipher Algorithm ----------
    private static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ('A' + (c - 'A' + shift + 26) % 26));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ('a' + (c - 'a' + shift + 26) % 26));
            } else if(Character.isDigit(c)) {
                result.append((char)('0'+(c-'9'+shift+9)%9));
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }
}


