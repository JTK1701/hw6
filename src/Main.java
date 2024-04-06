import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        for (int i = 1; i <= 10; i++ ){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2 задача");
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("3 задача");
        System.out.println("четные числа от 0 до 17:");
        for (int y = 0; y < 17; y += 2 ){
            System.out.print( y + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("4 задача");
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("5 задача");
        for (int i = 1994; i <= 2096; i += 4){
            System.out.println( i + " год является високосным");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("6 задача");
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("7 задача");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("8 задача");
        int money = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + money + " рублей.");
            money += 29000;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("9 задача");
        float money9 = 29000f;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + money9 + " рублей.");
            money9 += money9/100;
            money9 += 29000;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("10 задача ");
        for (int i = 1; i <= 10; i++) {
            int a = i * 2;
            System.out.println("2 * " + i + " = " + a);
        }
    }
}