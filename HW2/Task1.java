package HW2;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;
public class Task1 {

    static Scanner iScanner = new Scanner(System.in, "ibm866");
    static String input;
    public static void main(String[] args) {
        System.out.println(inpFloat());
    }
    public static float inpFloat() {

        System.out.println("Введите число типа float c точкой: ");
        input = iScanner.next();

        while (!input.matches("[+-]?([0-9]*[.])?[0-9]+")) { // если значение введено не верно, запросит ввод еще раз, до тех пор пока не будет введено число
            System.out.println("Введите число используя точку! Неверный ввод!");
            input = iScanner.nextLine();
        }
        iScanner.close();
        return Float.parseFloat(input); // parseFloat - возвращает число с плавающей запятой
    }    
}
