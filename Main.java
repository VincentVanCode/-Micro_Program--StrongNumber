import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int currentNumber = 0;
        int nextNumber = 0;
        int sum = 0;
        int factorialOfCurrentNumber = 1;
        while (number > 0) {

            //get current number
            currentNumber = number % 10;

            //factorial of current number
            for (int j = 1; j <= currentNumber; j++) {
                if (factorialOfCurrentNumber == 0){
                    factorialOfCurrentNumber += 1;
                }
                factorialOfCurrentNumber = j * factorialOfCurrentNumber;
                //System.out.println(factorialOfCurrentNumber);
            }
            sum += factorialOfCurrentNumber;
            factorialOfCurrentNumber *= 0;
            //get remaining digits of number
            nextNumber = number / 10;
            number = nextNumber;
        }
        //System.out.println(sum);
        if  (initialNumber == sum ){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
