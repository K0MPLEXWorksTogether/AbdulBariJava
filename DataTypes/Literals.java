class Literals{
    public static void main(String[] args) {
        short myShort = 30;
        int binaryNum = 0b1010;
        int octalNum = 0121;
        int hexadecimalNum = 0xA;
        long myLong = 14812l;

        char myChar = 'A';
        String myString = "String";

        float myFloat = 13.4f;
        double myDouble = 67.98;

        System.out.println("Short Assigned To Integer Literal: " + myShort);
        System.out.println("Binary Number: " + binaryNum);
        System.out.println("Octal Number: " + octalNum);
        System.out.println("Hexadecimal Number: " + hexadecimalNum);
        System.out.println("Long Assigned To Long Literal: " + myLong);
        System.out.println("Character Assigned To A Character Literal: " + myChar);
        System.out.println("Floating Point Assigned To Float Literal: " + myFloat);
        System.out.println("Double Assigned To Double Literal: " + myDouble);
        System.out.println("String Object Assigned to String Reference: " + myString);
    }
}