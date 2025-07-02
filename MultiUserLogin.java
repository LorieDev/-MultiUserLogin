import java.util.Scanner;

public class MultiUserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User 1
        System.out.print("User 1 - Enter your username: ");
        String user1Name = input.nextLine();

        System.out.print("User 1 - Enter your password: ");
        String user1Password = input.nextLine();

        // User 2
        System.out.print("User 2 - Enter your username: ");
        String user2Name = input.nextLine();

        System.out.print("User 2 - Enter your password: ");
        String user2Password = input.nextLine();

        // Reuse method for both users
        String login1 = buildLoginInfo(user1Name, user1Password);
        String login2 = buildLoginInfo(user2Name, user2Password);

        // Print results
        System.out.println("\n--- Login Information ---");
        System.out.println("User 1: " + login1);
        System.out.println("User 2: " + login2);

        input.close();
    }

    public static String buildLoginInfo(String userName, String password) {
        return "Username: " + userName + ", Password: " + password;
    }
}
