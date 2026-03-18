/**
 * OOPS Banner App - UC7
 * Demonstrates Inner Static Class with Character Pattern Mapping
 */
public class BannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {
        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize each line
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner
        for (char ch : text.toCharArray()) {
            String[] pattern = getCharacterPattern(patterns, ch);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Pattern for 'O'
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for 'P'
        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for 'S'
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        // Create CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Print "OOPS"
        printBanner("OOPS", patterns);
    }
}