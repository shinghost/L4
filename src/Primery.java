public class Primery {

    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static int n(){
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }

    public static int k(){
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }

    public static void l(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo>0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void t(int x) throws ArithmeticException {
        int h=10/x;
    }


    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1 "+ e);
        }
        System.out.println("2");


    try {
        System.out.println("0");
        throw new RuntimeException("Непроверяемая ошибка");
    } catch (Exception e) {
        System.out.println("1");
        System.out.println("2 "+ e );
    }
    System.out.println("3");

        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (RuntimeException e) {
            System.out.println("2" );
        }catch (Exception e) {
            System.out.println("3" );
        }
        System.out.println("4");

        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }catch (Exception e) {
            System.out.println("2" );
        }catch (Error e) {
            System.out.println("3" );
        }
        System.out.println("4");

        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        }catch (RuntimeException e) {
            System.out.println("2" );
        } catch (Exception e) {
            System.out.println("3" );
        } System.out.println("4");

         /* try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");

        System.out.println(m());*/
        System.out.println(n());
        System.out.println(k());

        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }finally {
            System.out.println("2" );
        }
        System.out.println("3");

        /*l(null,0.000001);*/

        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }

        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            t(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
