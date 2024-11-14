import java.util.Scanner;

class UsingScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Enter The First Number: ");
        int num1 = scan.nextInt();

        System.out.printf("Enter The Second Number: ");
        int num2 = scan.nextInt();

        System.out.println("Sum Is: " + (num1 + num2));
    }
}
