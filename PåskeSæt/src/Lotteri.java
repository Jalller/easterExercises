import java.util.Random;

public class Lotteri {
    int guessA;
    int guessB;

    public Lotteri(int guessA, int guessB) {
        this.guessA = guessA;
        this.guessB = guessB;
    }

    public int checkIfWon() {
        int max = 9;
        int min = 0;
        int[] numbers = new int[2];
        int number = (int) ((Math.random() * (max - min)) + min);
        int number2 = (int) ((Math.random() * (max - min)) + min);
        numbers[0] = number;
        numbers[1] = number2;
        int valet = 0;
        if(this.guessA==number && this.guessB==number2){
            System.out.println("you guessed both numbers, in the correct order");
            valet+=10000;
        } else if (this.guessA==number2 && this.guessB==number) {
            System.out.println("you guessed both numbers, in the wrong order");
            valet+=3000;
        } else if (this.guessA == number || this.guessA==number2||this.guessB==number||this.guessB==number2){
            System.out.println("you guessed one number");
            valet+=1000;
        } else {
            System.out.println("you did not guess any numbers");
            valet+=0;
        }
        System.out.println("Guess: " + number + number2);
        System.out.println("Lotteri numbers: " + guessA + guessB);
        System.out.println("you won: " + valet + " kr");
        return valet;
    }
}
