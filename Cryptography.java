/**
 * Based on basic cryptography concept Rot13: https://en.wikipedia.org/wiki/ROT13
 * @author Virat Singh, 2020mt93208@wilp.bits-pilani.ac.in
 */
public class Cryptography {

    // rotationary key
    private int rot;

    /**
     * Default constructor.
     */
    public Cryptography() {
        this.rot = 13;
    }

    /**
     * Default constructor.
     * @param rot the rotationary key
     */
    public Cryptography(int rot) {
        this.rot = rot;
    }

    /**
     * Rotate a word.
     * @param word the word to rotate
     * @return the rotated word
     */
    public String rotate(String word) {
        String rotatedWord = "";
        for(int i = 0; i < word.length; i++) {
            rotatedWord += rotateLetter(rotatedWord.charAt(i));
        }
        return rotatedWord;
    }

    /**
     * Rotate a letter
     * @param letter to rotate
     * @return the rotated letter
     */
    private char rotateLetter(char letter) {
        if((letter >= 'a' && letter <= 'm') || (letter >= 'A' && letter <= 'M')) {
            letter += rot;
        }
        else if((letter >= 'n' && letter <= 'z') || (letter >= 'N' && letter <= 'Z')) {
            letter -= rot;
        }
        return letter;
    }

    /**
     * Unrotate a word.
     * @param word the word to unrotate
     * @return the unrotated word
     */
    public String unrotate(String word) {
        String unrotatedWord = "";
        for(int i = 0; i < word.length; i++) {
            unrotatedWord += unrotateLetter(unrotatedWord.charAt(i));
        }
        return unrotatedWord;
    }

    /**
     * Unrotate a letter
     * @param letter to unrotate
     * @return the unrotated letter
     */
    private char unrotateLetter(char letter) {
        if((letter >= 'a' && letter <= 'm') || (letter >= 'A' && letter <= 'M')) {
            letter -= rot;
        }
        else if((letter >= 'n' && letter <= 'z') || (letter >= 'N' && letter <= 'Z')) {
            letter += rot;
        }
        return letter;
    }

}
