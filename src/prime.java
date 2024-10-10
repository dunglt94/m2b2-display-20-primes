import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố muốn in:");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;

        while (count < number) {
            N++;
            int i = 2;
            boolean isPrime = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                if (count == 0) System.out.print(N);
                else System.out.print(", " + N);
                count++;
            }
        }
    }
}
