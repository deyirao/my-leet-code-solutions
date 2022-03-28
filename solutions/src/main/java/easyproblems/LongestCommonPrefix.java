package easyproblems;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        char[] lettersOfFirstString = strs[0].toCharArray();
        String prefix = "";

        for (int i = 0; i < lettersOfFirstString.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < i + 1; j++) {
                sb.append(lettersOfFirstString[j]);
            }

            String tempPrefix = sb.toString();
            int counter = 0;

            for (String str : strs) {
                if (!str.startsWith(tempPrefix)) continue;
                counter++;
            }

            if (counter != strs.length) {
                return prefix;
            } else {
                prefix = tempPrefix;
            }
        }

        return prefix;
    }
}
