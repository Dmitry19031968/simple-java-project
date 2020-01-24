package palindrome;

public class Main {

    public static void main(String[] args) {
        String stringToTest = "No lemon, no melon";
        printOut(reverseString(stringToTest));
        printOut(isPalindromeReverseTheString(stringToTest));
    }

    public static String reverseString(String stringToReverse) {
        StringBuilder reverse = new StringBuilder();
        String clean = stringToReverse.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString());
    }

    public static boolean isPalindromeReverseTheString(String stringToTest) {
        String reversedString = reverseString(stringToTest);
        String clean = stringToTest.replaceAll("\\s+", "").toLowerCase();
        return reversedString.equals(clean);
    }

    public static void printOut(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void printOut(Boolean stringToPrint) {
        System.out.println(stringToPrint);
    }
}