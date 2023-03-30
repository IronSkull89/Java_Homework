package RecursPack;
public class recursive {
    public static String buildRecursive(int n, char c1, char c2, StringBuilder strBuild) {
        if (n == 0) return strBuild.toString();
        strBuild.append(c1);
        return buildRecursive(n-1, c2, c1, strBuild);
    }

    public static String buildRecursive(int n, String str, StringBuilder strBuild) {
        if (n == 0) return strBuild.toString();
        strBuild.append(str);
        return buildRecursive(n-1, str, strBuild);
    }
}
