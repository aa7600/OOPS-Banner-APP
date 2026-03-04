/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * @author Ananya
 * @version 7
 */

public class OOPSBannerApp {

    // Inner class
    static class CharacterPatternMap {

        char character;
        String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };
    }

    // Get pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {

                String[] pattern = getCharacterPattern(message.charAt(i), maps);
                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}