import java.security.SecureRandom;
public class DiceRolling {
    public final static int ROLLING_TIMES = 3600;

    public static void main(String[] args) {
        SecureRandom rollDice = new SecureRandom();


        int first;
        int second;
        int[] frequency = new int[36];

        int[] sumOfDice = new int[ROLLING_TIMES];
        for (int i = 0; i < ROLLING_TIMES; i++) {
            first = 1 + rollDice.nextInt(6);
            second = 1 + rollDice.nextInt(6);
            sumOfDice[i] = first + second;
        }

        for (int i = 0; i < sumOfDice.length; i++){
            System.out.printf("");
            ++frequency[sumOfDice[i]];
        }
        System.out.printf("%6s%10s%n", "Sum", "Frequency");
        for (int rating = 2; rating < 13; rating++){
            System.out.printf("%6d%10d\n",rating,frequency[rating]);
        }
    }
}
