import javax.swing.plaf.synth.SynthSeparatorUI;

public class str3 {
    public static void main(String[] args) {
        // ! Initializing a String
        /*
         * String firstring="Mohit's First String";
         */

        // STRING METHODS
        /*
         * System.out.print("my name is " + name.length());
         * System.out.print("\n");
         */

        /*
         * to create reference types we gonna use the 'new' .
         * String sirname = new String("Saini");
         * System.out.println(sirname);
         */

        /*
         * concating two strings
         * String mainname = new String("Mohit");
         * String sirname = new String("Saini");
         */

        // System.out.println(mainname + " <----------> " + sirname);

        // ! finding character at any specific index
        /*
         * System.out.println(mainname.charAt(1));
         */

        // ! Using replace method in java
        String first = "gotohell";
        System.out.println("Initial String : " + first);
        String second = first.replace('e', 'z');
        System.out.println("Final String : " + second);

        // ! Using Substring string method

        System.out.println(first.substring(0, 4));  // ----->>> goto

    }
}

// NOTES
/*
 * 1. Strings are immutable in java that you can't change the string once
 * initialized if you change it then you must store it in some other memory.
 */
