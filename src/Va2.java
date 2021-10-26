import java.util.InputMismatchException;
import java.util.Scanner;

public class Va2 {
    static Scanner sc;

    public static int[] fillArr() throws InputMismatchException {
        int count = Integer.parseInt(sc.next());
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Введите элемент: ");
            arr[i] = Integer.parseInt(sc.next());
        }
        return arr;
    }

    public static int[] fillCount(int[] arr) throws RuntimeException {
        int k = 0;
        int sum = 0;
        int avg = 0;
        for (int j = 0; j <= arr.length; j++) {
            if (j > 0) {
                k++;
                sum += j;
                avg = sum / k;
            }
        }
        return new int[]{k, sum, avg};
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        try {
            int[] arr = fillArr();
            int k = fillCount(arr)[0];
            int sum = fillCount(arr)[1];
            int avg = fillCount(arr)[2];

            if (k != 0) {
                for (int j = 0; j < k; j++) {
                    sum += j;
                }
                avg = sum / k;
                System.out.println("Среднее значение положительных элементов = " + avg);
            }
            else {
                throw new RuntimeException();
            }
        }

        catch(InputMismatchException ie){
                System.out.println("Ввод строки вместо числа");
            }
        catch(NumberFormatException ne){
                System.out.println("Несоответствие числового типа данных");
            }
        catch(RuntimeException re){
                System.out.println("Положительные элементы отсутствуют");
            }
        }
    }

