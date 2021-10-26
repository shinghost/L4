import java.util.InputMismatchException;
import java.lang.RuntimeException;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class Va1 {
    static Scanner sc;
    static int sum = 0;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        try {
            int count = Integer.parseInt(sc.next());
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Введите элемент: ");
                arr[i] = Integer.parseInt(sc.next());
            }
            System.out.println("Прошу: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + "");
            }

            int k = 0;
            for (int i = 0; i < count; i++) {
                if (arr[i]>0)
                    k++;
            }

            if (k != 0) {
                for (int i = 0; i < k; i++) {
                    sum += arr[i];
                }
                int avg = sum / k;
                System.out.println("Среднее значение положительных элементов = " + avg);
            }
            else {
                throw new RuntimeException();
            }
        }
        catch (InputMismatchException ie) {
            System.out.println("Ввод строки вместо числа");
        }
        catch (NumberFormatException ne) {
            System.out.println("Несоответствие числового типа данных");
        }
        catch (RuntimeException re) {
            System.out.println("Положительные элементы отсутствуют");
        }

    }
}
