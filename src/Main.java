import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Ascii: ");

        boolean convert = true;
        while (convert) {
            int Ascii = myObj.nextInt();
            System.out.print((char) Ascii);
            if (Ascii == 0) {
                convert = false;
            }
        }

        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = myName.next();

        System.out.print(name);

        //char letter = 'a';
        //int number = 67;
        //System.out.print(letter + " = " + (int)letter);
        //System.out.print((int)letter);
        //System.out.print((char)number);
    }
}
