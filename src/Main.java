import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int task = 0; // храним номер задания
        int number = 0; // храним число пользователя
        String binaryNumber = ""; // храним

        // цикл на проверку ввода номера задания
        System.out.println("Выберите номер задания (1-3): ");
        Scanner numberTask = new Scanner(System.in);

        while (true) {
            try {
                task = numberTask.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Введите число!");
                continue;
            }

            if(task == 1) {
                taskNumber1(number);
                break;
            } else if(task == 2) {
                taskNumber2(number);
                break;
            } else if (task == 3) {
                taskNumber3(binaryNumber);
                break;
            } else {
                System.out.println("Вы ввели неверный номер задания!");
                continue;
            }
        }
        // завершение цикла на проверку ввода номера задания
    }


    /* Метод для конвертации
    *  из 10-ой в 16-ую систему счисления
    * */
    public static void taskNumber1(int number) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 0 до 10000: ");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
                continue;
            }

            if(number >= 0 && number <= 10000) {
                conversionTo16(number); // Вызов метода для конвертации
                break;
            } else {
                System.out.println("Вы вышли за диапазон чисел!");
                continue;
            }
        }
    }

    /* Метод для конвертации
     *  из 10-ой в 2-ую систему счисления
     * */
    public static void taskNumber2(int number) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 0 до 10000: ");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число!");
                continue;
            }

            if(number >= 0 && number <= 10000) {
                conversionTo2(number); // Вызов метода для конвертации
                break;
            } else {
                System.out.println("Вы вышли за диапазон чисел!");
                continue;
            }
        }
    }

    /* Метод для конвертации
     *  из 2-ой в 10-ую систему счисления
     * */
    public static void taskNumber3(String binaryNumber) {
        Scanner scanner = new Scanner(System.in);
        while (binaryNumber.equals("")) {
            System.out.println("Введите двоичное число: ");
            binaryNumber = scanner.nextLine();
            if (!binaryNumber.matches("[01]{1,}"))  {
                System.out.println("Вы ввели неверно!");
                binaryNumber = "";
                continue;
            }
            else {
                conversionTo10(binaryNumber); // Вызов метода для конвертации
                break;
            }
        }
    }


    // Метод конвертации для первого задания
    private static void conversionTo16(int number) {
        String convert = Integer.toHexString(number).toUpperCase();
        System.out.println("Ваше число "+ number + " в 16-ой системе счисления: " + convert);
    }

    // Метод конвертации для второго задания
    private static void conversionTo2(int number) {
        String convert = Integer.toBinaryString(number);
        System.out.println("Ваше число "+ number + " в 2-ой системе счисления: " + convert);
    }

    // Метод конвертации для третьего задания
    private static void conversionTo10(String binaryNumber) {
        int binaryValue = Integer.parseInt(binaryNumber, 2);
        System.out.println("Ваше число "+ binaryNumber + " в 2-ой системе счисления: " + binaryValue);
    }

}
