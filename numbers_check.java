import java.util.Scanner;

public class NumbersCheck {

    static String check(int x) {
        if (x > 0) {
          return  "Число " + x + " є позитивним.";
        }
        else return "Число " + x + " є негативним.";
    }


    static String prime(int y) {
        int i, count = 0;
        for (i = 2; i <= y / 2; i++) {
            if (y % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && y != 1) {
            return "Число " + y +  " є натуральним.";

        } else {
            return "Число " + y + " не є натуральним.";
        }
    }


    static String left (int z) {
        if (z % 2 == 0 && z % 3 == 0 && z % 5 == 0 && z % 6 == 0 && z % 9 == 0){
          return   "Число " + z + " ділиться на 2, 3, 5, 6, 9 без остачі.";

        }else

        return "Під час ділення є остача від числа.";
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Перевірим число чи воно є негативним чи ні. Введіть будь - яке :");
        int x = scan.nextInt();
        System.out.println(check(x));;
        System.out.println();

        System.out.println("Введіть число для перевірки чи є воно натуральним : ");
        int y = scan.nextInt();
        System.out.println(prime(y));
        System.out.println();

        System.out.println("Введіть число для перевірки чи воно ділиться на 2, 3, 5, 6, 9 без остачі : ");
        int z = scan.nextInt();
        System.out.println(left(z));
    }
}

