/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная
 * была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 * 4. Если введено exit, то программа завершается.
 * <p>
 * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
 * > java
 * > python
 * > c#
 * > print
 * < [c#, python, java]
 * > revert
 * > print
 * < [python, java]
 * > revert
 * > revert
 * > print
 * < []
 * > revert -> throw new NoSuchElementException
 */

package Lesson04;

import java.util.LinkedList;
import java.util.Scanner;

public class lesson04 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for string: ");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                System.out.println(linkedList);
            } else if (input.equalsIgnoreCase("revert")) {
                if (!linkedList.isEmpty()) {
                    linkedList.pop();
                }
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                linkedList.push(input);
            }

        }

    }

}
