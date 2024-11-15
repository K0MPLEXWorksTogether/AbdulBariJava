import java.util.Scanner;

class Cuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter The Length: ");
        float length = scan.nextFloat();

        System.out.printf("Enter The Breadth: ");
        float breadth = scan.nextFloat();

        System.out.printf("Enter The Height: ");
        float height = scan.nextFloat();

        float volume = length * breadth * height;
        float face1 = length * breadth;
        float face2 = length * height;
        float face3 = breadth * height;

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + (2 * (face1 + face2 + face3)));
        scan.close();
    }
}
