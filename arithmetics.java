import java.util.Scanner;

public class Arithmetics {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть першу цифру: ");
        int a = scanner.nextInt();
        System.out.println("Вкажіть другу цифру: ");
        int b = scanner.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть математичну дію: ");
        String sing = in.next();
        switch (sing) {
            case "/":
                if ( b == 0) System.out.println("Вибачте, не можна ділити на 0");
                else System.out.println(Arithmetics.div(a,b));
                break;
            case "*":
                System.out.println(Arithmetics.mul(a, b));
                break;
            case "+":
                System.out.println(Arithmetics.add(a, b));
                break;
            case "-":
                System.out.println(Arithmetics.sub(a, b));
                break;


        }
    }
}
