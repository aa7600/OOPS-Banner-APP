/**
 * OOPS Banner App
 * UC6: Render OOPS banner using Static Function
 * @author Ananya
 * @version 6
 */

public class OOPSBannerApp {

    // Static function to generate banner lines
    public static String[] getBannerLines() {

        return new String[]{

            String.join(" ", " *** ", " *** ", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*   *", "*    "),
            String.join(" ", "*   *", "*   *", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", "*   *", "*   *", "*    ", "    *"),
            String.join(" ", " *** ", " *** ", "*    ", "*****")

        };
    }

    public static void main(String[] args) {

        String[] lines = getBannerLines();

        for (String line : lines) {
            System.out.println(line);
        }

    }
}