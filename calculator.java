import java.util.Scanner;

public class Calculator {
    static int average(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Давайте знайдем середнє арифметичне від числа.\nВведіть перше число: ");
        int x = scan.nextInt();

        System.out.println("Введіть друге число: ");
        int y = scan.nextInt();

        System.out.println("Введіть третє число: ");
        int z = scan.nextInt();

        System.out.println("Середнім арифметичним є число " + average(x,y,z) + ".");
    }
}
