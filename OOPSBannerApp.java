/**
 * UC5 - Render OOPS as Banner using Inline Array Initialization
 * Combines declaration and initialization in one statement
 * 
 * @author Netra
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration + initialization
        String[] banner = {

            String.join(" ",
                    "  *****  ",
                    "  *****  ",
                    "  ****** ",
                    "  ****** "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *       "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *       "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " ******  ",
                    "  *****  "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *       ",
                    "       * "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *       ",
                    " *     * "),

            String.join(" ",
                    "  *****  ",
                    "  *****  ",
                    " *       ",
                    "  *****  ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}