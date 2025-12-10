package pr12;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            // Сработает, если ввести "Qwerty" или "1.2" (так как это не целое)
            System.out.println("Ошибка: Введено не целое число!");
        } catch (ArithmeticException e) {
            // Сработает, если ввести "0"
            System.out.println("Ошибка: Деление на ноль!");
        } catch (Exception e) {
            // Задание №3: Общий catch. Он ловит всё остальное.
            // Важно: в Java catch(Exception) должен стоять ПОСЛЕ конкретных исключений,
            // иначе код не скомпилируется (ошибка "Unreachable code").
            System.out.println("Произошло какое-то другое исключение");
        } finally {
            // Задание №4: Блок finally выполняется ВСЕГДА, была ошибка или нет.
            System.out.println("Блок finally выполнен.");
        }
    }
}
