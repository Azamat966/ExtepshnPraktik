import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10,20,30,40,50};
        try {
            System.out.println("Введите число для елемента массива :");
            int a = scanner.nextInt();
            for ( int b : numbers ) {
                int sum = b/a;
                System.out.println(b +" / "+a+ " = "+sum);
            }


        }catch (ArithmeticException e){
            System.out.println("0 го болунбойт");

        }
        }

    private static class numbers {
    }
}











