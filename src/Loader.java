import java.util.Scanner;
public class Loader {
    public static void main (String[] args)
    {
        Circle a = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер окружности: ");
        a.setNumber (input.nextInt());
        System.out.print("Введите радиус окружности: ");
        a.setRadius(input.nextInt());
        System.out.print("Длина окружности: ");
        a.getLength();


        System.out.println(a);
        System.out.println();
        // System.out.println(a);
    }
}