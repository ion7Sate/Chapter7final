import java.util.Scanner;

public class DuplicateElimanation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int array[] = new int[5];

        int count = 0;
        int x = 0;
        int number = 0;

        System.out.println("Enter five numbers, each between 10 and 100: ");
        while (x < array.length) {
            System.out.println("Enter  your number: ");
            number = input.nextInt();

            if ((number >= 10) && (number <= 100)) {
                boolean digit = false;
                x++;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == number)
                        digit = true;
                }
                if (!digit) {
                    array[count] = number;
                    count++;
                } else{
                    System.out.println("You entered this number later\n");
                }
            } else {
                System.out.println("Number must be between 10 and 100");
            }

            for (int i = 0; i < x; i++) {
                if (array[i] != 0){
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
