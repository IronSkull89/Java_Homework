import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class homework5 {
    static Map<Character, Character> brackets = new HashMap<>();

    public static void fillBrackets() {
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');
        brackets.put('>','<');
    }

    public static void main(String[] args) {
        fillBrackets();

        System.out.println(isCorrectParentheses("()"));
        System.out.println(isCorrectParentheses("("));
        System.out.println(isCorrectParentheses("())"));
        System.out.println(isCorrectParentheses("((()))"));
        System.out.println(isCorrectParentheses("()[]{}<>"));
        System.out.println(isCorrectParentheses("([)]"));
        System.out.println(isCorrectParentheses("][]"));
        System.out.println(isCorrectParentheses("[]{<()[]<>>}"));
    }

    public static boolean isCorrectParentheses (String parentheses) {
        char[] parentheseChar = parentheses.toCharArray();
        Deque<Character> bracketStack = new ArrayDeque<>();
        for (char c: parentheseChar) {
            if (brackets.containsValue(c)) bracketStack.add(c);
            else if (brackets.containsKey(c) && bracketStack.size() > 0 && brackets.get(c) == bracketStack.getLast())
                bracketStack.removeLast();
            else return false;
        }
        return bracketStack.size() == 0 ? true : false;
    }
}
