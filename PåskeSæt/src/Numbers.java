import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Numbers {
    int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public int averageOfNumbers () {
        int sum=0;
        for (int i=0;i<numbers.length;i++) {
            sum= sum + numbers[i];
        }
        return sum/numbers.length;
    }
    public void higherThanAverage () {
        for (int i=0;i<numbers.length;i++) {
            if(numbers[i]>averageOfNumbers()) {
                System.out.println("the average was: " + averageOfNumbers() + " : the numbers: " + Arrays.toString(numbers) +  " : numbers higher than average: " + numbers[i] + " : at index: " + i);
            }
        }
    }

}
