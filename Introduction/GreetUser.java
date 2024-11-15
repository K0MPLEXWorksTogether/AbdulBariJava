import java.util.Scanner;

class GreetUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("May I Know Your Name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}
