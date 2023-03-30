public class homework2 {
    public static void main(String[] args) {

        System.out.println(buildString(7, 'f','K'));
    }

    static String buildString(int n, char c1, char c2) {
        StringBuilder strBuild = new StringBuilder();
        return buildRecursive(n, c1, c2, strBuild);
    }

    static String buildRecursive(int n, char c1, char c2, StringBuilder strBuild) {
        if (n == 0) return strBuild.toString();
        strBuild.append(c1);
        return buildRecursive(n-1, c2, c1, strBuild);
    }
}
