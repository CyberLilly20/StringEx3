package se.Lexicon;

/**
 * Convert the following String: "CAPS EQUALS SCREAMING" to
 * lowercase and print it out. Then convert it back to
 * uppercase and print it out again.
 */


public class StringEx5 {

    public static void ex5() {
        String sentence = "CAPS EQUALS SCREAMING";
        String toLowerCase = sentence.toLowerCase();
        String toUpperCase = toLowerCase.toUpperCase();

        System.out.println("Lower Case:" + " " + toLowerCase);
        System.out.println("Upper Case:" + " " + toUpperCase);
    }

}
