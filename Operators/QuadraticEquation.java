import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter The Co-Efficient For x^2 Term: ");
        float a = scan.nextFloat();
        
        System.out.printf("Enter The Co-Efficient For x Term: ");
        float b = scan.nextFloat();

        System.out.printf("Enter The Co-Efficient For Constant Term: ");
        float c = scan.nextFloat();

        float root1 = (-b + (float)Math.sqrt((b *  b) - (4 * a * c))) / (2 * a);
        float root2 = (-b - (float)Math.sqrt((b *  b) - (4 * a * c))) / (2 * a);

        System.out.println("Root1: " + root1);
        System.out.println("Root2: " + root2);
        scan.close();
    }    
}
