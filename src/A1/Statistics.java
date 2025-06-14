package A1;

public class Statistics {
    public static int countOnes(String s) {
        int count = 0;
        // for (int i = 1; i < s.length(); i++) { //Fehler
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                count++;
        }
        return count;
    }
    public static int countChar(String s, char target) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target)
                count++;
        }
        return count;
    }


}
