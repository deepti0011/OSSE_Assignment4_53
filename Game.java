import Cryptography;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Cryptography cryptography = new Cryptography();

        System.out.println("Your secret word is " + cryptography.rotate(input));

    }

}
