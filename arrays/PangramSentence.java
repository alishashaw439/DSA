//A pangram is a sentence where every letter of the English alphabet appears at least once.
public class PangramSentence {
    public static void main(String args[]) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] mark = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            mark[ch - 'a'] = true;
        }
        for (int i = 0; i < mark.length; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
}
