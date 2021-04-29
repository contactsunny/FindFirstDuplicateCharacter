package com.contactsunny.poc.findfirstduplicatecharacter;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'd', 'd', 'a', 'b'};
        Character character = findFirstDuplicate(input);

        if (character == null) {
            System.out.println("No duplicates found!");
        } else {
            System.out.println("First duplicate character: " + character);
        }
    }

    /**
     * Method to find the first duplicate character
     *
     * @param input the input character array
     *
     * @return the character that is duplicated first
     */
    private static Character findFirstDuplicate(char[] input) {
        // Creating a set to store all the "visited" characters
        Set<Character> charCount = new HashSet<Character>();

        // Looping through all the characters
        for (char character : input) {
            // Checking if we have already visited this character.
            // If we have, that means we have a duplicate, so return from here.
            if (charCount.contains(character)) {
                return character;
            }
            // If the char is not found in the set, it means this is the first
            // instance of the char. So save it in the set and continue.
            charCount.add(character);
        }

        return null;
    }
}
