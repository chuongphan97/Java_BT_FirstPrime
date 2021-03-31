import java.util.Scanner;

public class FirstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Input number: ");
        int number = scanner.nextInt();


        for (int i = 1; ;i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count +=1;
            }
            if (count == number) break;
            }




    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        else if (number == 2 || number == 3) return true;
            else {
                for (int i = 2; i < number;i++) {
                    if (number % i == 0) return false;
                }
                return true;
        }

    }


}
