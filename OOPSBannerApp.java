/**
 * UC3 - Render OOPS as Banner using String.join()
 * Refactored from UC2 to improve memory efficiency
 * by replacing + operator with String.join()
 * 
 * @author Netra
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  ****** "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * "));

        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * "));

        System.out.println(String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  "));
    }
}