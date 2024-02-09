package Basicproblems;

import java.util.Arrays;
import java.util.HashSet;

public class Deep_copy_of_Set {

    public static void main(String[] args) {

        // Given Set of Strings
        HashSet<String> Set = new HashSet<>(Arrays.asList("hello", "from", "gfg"));

        // Deep copy using copy constructor in Hashset.
        HashSet<String> copied_set = new HashSet<>(Set);

        // test the Set
        copied_set.remove("java");

        // show the results
        System.out.println("Original Set "+Set);
        System.out.println("Copied Set" +copied_set);

    }
}
