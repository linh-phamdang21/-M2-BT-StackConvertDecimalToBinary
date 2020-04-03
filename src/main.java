import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args) {
        int decimalNumber;
        Stack<String> binaryNumber = new Stack<>();
        String binaryNumberResult = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        decimalNumber = scanner.nextInt();
        while (decimalNumber != 0){
            int rem = 0;
            rem = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber.push(rem + "");
        }
        for (int i = 0; i < binaryNumber.size(); i++){
            binaryNumberResult += binaryNumber.get(i);
        }
        System.out.println("After converting: " + binaryNumberResult);
    }
}
