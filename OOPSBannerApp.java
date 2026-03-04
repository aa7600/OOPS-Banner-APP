/**
 * OOPSBannerApp UC5 – Render OOPS Banner using Inline Array Initialization
 * Using String.join() inside array initialization
 * @author Ananya
 * @version 5
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] lines = {

            String.join(" ", " *** ", " *** ", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", " *** ", " *** ", "*    ", "*****")

        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }

    }
}