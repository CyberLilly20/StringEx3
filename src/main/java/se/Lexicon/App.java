package se.Lexicon;


public class App {
    public static void main(String[] args) {
        String sentence = "CAPS EQUALS SCREAMING";
        System.out.println(sentence);
        String upperCase ="CAPS EQUALS SCREAMING";
        String toLowerCase = upperCase.toLowerCase();
        System.out.println(toLowerCase);
        String toUpperCase = toLowerCase.toLowerCase();
        System.out.println(toLowerCase);


        System.out.println("Lower Case:" + " " + sentence.toLowerCase());
        System.out.println("Upper Case:" + " " + sentence.toUpperCase());


    }

}
