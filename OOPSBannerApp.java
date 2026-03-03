/**
 * UC3 - Display OOPS Banner using String.join()
 * Prints OOPS using String.join() properly aligned.
 * 
 * @author Netra
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ", "*****", "*****", "*****", "*****"));
        System.out.println(String.join("  ", "*   *", "*   *", "*   *", "*"));
        System.out.println(String.join("  ", "*   *", "*   *", "*   *", "*"));
        System.out.println(String.join("  ", "*   *", "*****", "*****", "*****"));
        System.out.println(String.join("  ", "*   *", "*     ", "*        ", "*"));
        System.out.println(String.join("  ", "*   *", "*     ", "*        ", "*"));
        System.out.println(String.join("  ", "*****", "*     ", "*","  ","*****"));

    }
}