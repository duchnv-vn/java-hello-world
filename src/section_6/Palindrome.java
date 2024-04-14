public class Palindrome {
    private boolean isPalindrome;

    public static void main(String[] args) {
    }

    public boolean getIsPalindrome() {
        return this.isPalindrome;
    }

    public Palindrome(String input) {
        StringBuilder reverseInput = new StringBuilder(input).reverse();
        this.isPalindrome = input.equals(reverseInput.toString());
    }
}
