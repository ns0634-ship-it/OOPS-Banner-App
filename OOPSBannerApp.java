import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Banner App using HashMap
 */
public class BannerApp {

    /**
     * Method to create and return character patterns
     */
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    /**
     * Method to print banner
     */
    public static void printBanner(String text, Map<Character, String[]> map) {

        StringBuilder[] lines = new StringBuilder[7];

        // Initialize lines
        for (int i = 0; i < 7; i++) {
            lines[i] = new StringBuilder();
        }

        // Build banner
        for (char ch : text.toCharArray()) {
            String[] pattern = map.get(ch);

            for (int i = 0; i < 7; i++) {
                lines[i].append(pattern[i]).append("  ");
            }
        }

        // Print banner
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patterns = getCharacterPatterns();

        printBanner("OOPS", patterns);
    }
}