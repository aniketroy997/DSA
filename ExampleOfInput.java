import java.util.Scanner;

public class ExampleOfInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        System.out.println("this is the total " + c);

        // type casting
        int num = (int)(122.344f);
        System.out.println(num);

        //automatic type casting
        int a1 = 245;
        byte b1 = (byte) (a1); // 256 % 257 = 1
        System.out.println(b1);

        int number = Integer.parseInt("A");
        System.out.println(number);

    }
}
