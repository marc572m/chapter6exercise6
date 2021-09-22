package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canSpell2("ækfslabe", "abe"));
    }

    public static boolean canSpell(String letters, String word) {
        boolean spell = true;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!letters.contains(String.valueOf(letter))) {
                spell = false;
                break;
            } else {
                letters = letters.replaceFirst(String.valueOf(word.charAt(i)), "");
            }
        }
        return spell;

    }
    public static boolean canSpell2(String bogstavsBunken, String ordSomViBygger) {
        int antalBogstaverIOrdet = ordSomViBygger.length();
        for (int i = 0; i < ordSomViBygger.length(); i++) {

            char bogstavSomViErIGangMed = ordSomViBygger.charAt(i);
            for (int j = 0; j < bogstavsBunken.length(); j++) {
                if (bogstavSomViErIGangMed == bogstavsBunken.charAt(j)) {
                    System.out.println(bogstavsBunken + " før sletning");
                    bogstavsBunken = bogstavsBunken.substring(0,j)+""+bogstavsBunken.substring(j+1);
                    System.out.println(bogstavsBunken + " efter sletning");
                    antalBogstaverIOrdet = antalBogstaverIOrdet - 1;
                    System.out.println("Så mange bogstaver mangler at blive fundet endnu:  " + antalBogstaverIOrdet);
                }
            }
        }
        return antalBogstaverIOrdet == 0;
    }
}
