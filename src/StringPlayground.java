public class StringPlayground {

    public static int countParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String[] testStrings = {"((3 + 7) * 2)", "((3 + 7) * 2))"};

        for (String testString : testStrings) {
            int result = countParentheses(testString);

            System.out.println("String: " + testString + ", Parentheses count: " + result);
        }
    }
}