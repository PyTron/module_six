import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Hangman game = new Hangman();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a secret word...");
        game.setSecretWord(input.next());
        while(game.stillPlaying()){
            System.out.println("The disguised word is " + game.getDisguisedWord());
            System.out.print("Make a Guess...");
            game.MakeGuess(input.next().charAt(0));
            System.out.println("You have made " + game.getGuessCount() + " guesses");
            System.out.println("You have made " + game.getBadGuessCount() + " bad guesses");           
        }
    }
}
