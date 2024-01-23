package Basicproblems;


// java programme for checking a String contains only ASCII characters.
public class Ascii_value_of_char {
    public static void main(String[] args) {
     String s1 = "GeeksforGeeks" ;// contains ASCII characters
        String s2 = "€_is_a_Symbol_of_euro"; // contains non-ASCII character

        boolean checkASCII_for_s1 = true;
        boolean checkASCII_for_s2 = true;

        for (int i = 0; i < s1.length(); i++) {
            int Char = s1.charAt(i);
            if (Char>127) {
                checkASCII_for_s1 = false;
                break;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            int Char = s2.charAt(i);
            if (Char>127) {
                checkASCII_for_s2 = false;
                break;
            }
        }

        System.out.println( "is s1 contains only ASCII characters :"+ checkASCII_for_s1 );
        System.out.println( "is s2 contains only ASCII characters :"+ checkASCII_for_s2 );

        // TODO using String.matches() method and pass a Regex (regular) expression in the constructor.

        System.out.println( "is s1 contains only ASCII characters :"+ s1.matches("\\A\\p{ASCII}*\\z"));

        System.out.println( "is s2 contains only ASCII characters :"+ s2.matches("\\A\\p{ASCII}*\\z"));


    }
}
