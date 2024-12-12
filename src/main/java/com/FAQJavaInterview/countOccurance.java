package com.FAQJavaInterview;
import java.util.HashMap;
import java.util.Map;
public class countOccurance {


    public static class VowelOccurrences {
        public static void main(String[] args) {
            String word = "bengaluru";
            Map<Character, Integer> vowelOccurrences = new HashMap<>();

            for (char c : word.toCharArray()) {
                if (isVowel(c)) {
                    vowelOccurrences.put(c, vowelOccurrences.getOrDefault(c, 0) + 1);
                }
            }

            // Sort vowels by occurrence and alphabetical order
            vowelOccurrences.entrySet().stream()
                    .sorted((entry1, entry2) -> {
                        int occurrenceDiff = entry2.getValue() - entry1.getValue();
                        if (occurrenceDiff == 0) {
                            return entry1.getKey() - entry2.getKey();
                        }
                        return occurrenceDiff;
                    })
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }

        private static boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }
    }
}
