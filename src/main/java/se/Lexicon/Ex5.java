package se.Lexicon;

/**
 * Correct the following String: "Java is the worst
 * programming language!" by replacing the (obviously
 * incorrect) word "worst" with the word "best". Then print
 * out the sentence.
 */

public class Ex5 {
    public static void mein(String[] args) {
        String opinions = "Java is the worst programming language!";
        System.out.println(opinions.replace("worst", "best"));

    }
}
