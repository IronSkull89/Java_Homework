//    Реализовать приложение, которое:
//    Принимает от пользователя и запоминает строки
//    Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
//    Если введено revert, то удаляем последнюю введеную строку
//    Если введено exit, то завершаем программу

import java.util.*;

public class homework4 {

    public static void main(String[] args) {
        LinkedList<String> consoleStack = new LinkedList<>();
        String inUser = "";
        Scanner in = new Scanner(System.in);
        while (!inUser.equals("exit")) {
            System.out.print("Введите строку: ");
            inUser = in.nextLine();

            if (inUser.equals("print")) {
                ListIterator litr = consoleStack.listIterator(consoleStack.size());
                while(litr.hasPrevious()) {
                    System.out.println(litr.previous());
                }
            }
            else if (inUser.equals("revert")) consoleStack.pollLast();
            else if (!inUser.equals("exit")) consoleStack.add(inUser);
        }
    }
}
