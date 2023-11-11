public class test {
    public static void main(String[] args) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789_";
        int length = 3;
        generateCombinations(characters, length, "");
    }

    public static void generateCombinations(String characters, int length, String current) {
        if (length == 0) {
            System.out.println(current);
        } else {
            for (int i = 0; i < characters.length(); i++) {
                String newCurrent = current + characters.charAt(i);
                generateCombinations(characters, length -1, newCurrent);
            }
        }
    }
}
