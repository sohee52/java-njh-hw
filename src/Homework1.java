import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            sum += scanner.nextInt();
            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }
        scanner.close();
    }
}
