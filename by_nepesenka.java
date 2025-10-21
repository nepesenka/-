 import java.util.Scanner;

public class by_nepesenka {
    public static void main(String[] args) {
    
        System.out.println("Привет, это мой первый калькулятор");
        
     Scanner scan = new Scanner(System.in);
     System.out.print("Введи 1 число: ");
     float num1 = scan.nextFloat();
     System.out.print("Введи 2 число: ");
     float num2 = scan.nextFloat();

     float res1 = num1 + num2; System.out.print(res1 + " плюсовал "); // плюсует
     float res2 = num1 - num2; System.out.print(res2 + " минусовал "); // минусует
     float res3 = num1 * num2; System.out.print(res3 + " умножал "); // умножает
     float res4 = num1 / num2; System.out.print(res4 + " делил "); // разделяет

        System.out.println("Получилось: " );
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }
}