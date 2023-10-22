import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("");

        // firstTask();
        secondTask();
    }

    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Kadr> kadrs = new ArrayList<>();

        while (true) {
            System.out.println("Кого ви хочете створити:\n'1' - Звичайний робтник.\n'2' - Інженер\n'3' - Адміністратор");
            Integer symbol = scanner.nextInt();
            scanner.nextLine();

            if (symbol == 1) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your birthdate: ");
                String date = scanner.nextLine();

                Robitnyk person = new Robitnyk(name, date);
                kadrs.add(person);
            } else if (symbol == 2) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your birthdate: ");
                String date = scanner.nextLine();
                System.out.print("Enter your education: ");
                String education = scanner.nextLine();

                Ingineer person = new Ingineer(name, date, education);
                kadrs.add(person);
            } else if (symbol == 3) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your birthdate: ");
                String date = scanner.nextLine();
                System.out.print("Enter your key: ");
                Integer key = scanner.nextInt();

                Administrator person = new Administrator(name, date, key);
                kadrs.add(person);
            } else if (symbol == 4) {
                for (Kadr item : kadrs) {
                    item.Show();
                }
            } else {
                System.out.println("EXIT - ->");
                break;
            }
        }
    }
    public static void secondTask() {
        double x = 1;

        Ellipse ellipse = new Ellipse();
        System.out.println("Обчислення для еліпса:");
        ellipse.printResult(x);

        Hyperbola hyperbola = new Hyperbola();
        System.out.println("Обчислення для гіперболи:");
        hyperbola.printResult(x);
    }
}
