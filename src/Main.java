import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Введите возраст:");
        int age = src.nextInt();
        System.out.print("Введите имя:");
        String name = src.next();
        System.out.print("Ввeдите фамилию:");
        String fam = src.next();
        System.out.print("Введите массу тела в Кг, с точностью до Г:");
        float mass = src.nextFloat();
        System.out.print("Введите Рост(м):");
        double hiegh = src.nextDouble();
        System.out.println("Зовут:" + name + " " + fam.charAt(0) + "." + " " + "Полных лет:" + age + " " + "Вес:" + mass + "кг" + " " + "Рост:" + hiegh + "M");
    }
}
