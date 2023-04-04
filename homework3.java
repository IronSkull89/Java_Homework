import jdk.nashorn.internal.ir.TryNode;

import java.util.*;

public class homework3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers);

        removeEvenNumber(numbers);
        System.out.println(numbers);


        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        System.out.println(strings);

        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        numbers.removeIf(n -> n % 2 == 0);
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        strings.removeIf(s -> intTryParse(s));
    }

    static public Boolean intTryParse(Object obj) {
        try {
            Integer.parseInt((String) obj);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
