import java.util.Scanner;

public class Conversion {
    static double cur (double money1) {
        return money1 * 29.25;
    }

    public static void main(String[] args) {
        System.out.println("Ми допоможем перевести долари США в еквіваленту суму в українських гривнях.\nБудь-ласку введіть суму доларів для конвертації: ");
        Scanner scan = new Scanner(System.in);
        double dollar = scan.nextDouble();
        System.out.println("Дякую, курс долара НБУ 29.25");
        System.out.println("До отримання " + cur(dollar) + " грн.");

    }
}
