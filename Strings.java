package StringPack;

import RecursPack.recursive;
public class Strings {
    public static String buildString(int n, char c1, char c2) {
        StringBuilder strBuild = new StringBuilder();
        return recursive.buildRecursive(n, c1, c2, strBuild);
    }

    public static String buildString(int n, String str) {
        StringBuilder strBuild = new StringBuilder();
        return recursive.buildRecursive(n, str, strBuild);
    }
}
