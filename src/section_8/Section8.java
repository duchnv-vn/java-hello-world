package section_8;

public class Section8 {
    public static void main(String[] args) {
        /*
         * String fruitName = "banana";
         * String price = switch (fruitName) {
         * case "banana", "apple" -> "$1.0 charged";
         * case "straw berry" -> "$2.0 charged";
         * default -> "Pick a valid fruit";
         * };
         */

        /*
         * switch (fruitName) {
         * case "banana", "apple" -> {
         * System.out.println("$1.0 charged");
         * }
         * case "straw berry" -> {
         * System.out.println("$2.0 charged");
         * }
         * default -> {
         * System.out.println("Pick a valid fruit");
         * }
         * }
         */

        // LABELLED BREAK TO CONTROL TERMINATE SPECIFIED LOOP
        outer: for (int i = 0; i < 5; i++) {
            inner: for (int j = 0; j < 3; j++) {
                if (i == 3) {
                    break outer; // LABELLED BREAK
                }

                System.out.println(i + " - " + j);
            }
        }

        // LABELLED CONTINUE TO CONTROL SKIP SPECIFIED LOOP
        outer: for (int i = 0; i < 5; i++) {
            inner: for (int j = 0; j < 3; j++) {
                if (i == 3) {
                    continue outer; // LABELLED CONTINUE
                }

                System.out.println(i + " - " + j);
            }
        }
    }
}
