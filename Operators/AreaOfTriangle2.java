import java.util.Scanner;

class AreaOfTriangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter The First Side Of The Triangle: ");
        float side1 = scan.nextFloat();

        System.out.printf("Enter The Second Side Of The Triangle: ");
        float side2 = scan.nextFloat();

        System.out.printf("Enter The Third Side Of The Triangle: ");
        float side3 = scan.nextFloat();

        double s = (0.5) * (side1 + side2 + side3);
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area: " + area);
        scan.close();
    }    
}
