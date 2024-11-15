import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter The Base Of The Triangle: ");
        float base = scan.nextFloat();
        System.out.printf("Enter The Height Of The Triangle: ");
        float height = scan.nextFloat();
        double area = (0.5f) * (base * height);
        System.out.println("Area: " + area);
        scan.close();
    }
}
