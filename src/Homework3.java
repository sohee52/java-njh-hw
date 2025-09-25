import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거
        System.out.print("수를 입력하세요: ");
        String[] numbers = scanner.nextLine().split(" ");
        while (numbers.length != n) {
            System.out.println("입력한 수의 개수가 예상한 개수와 다릅니다.");
            System.out.print("다시 수를 입력하세요: ");
            numbers = scanner.nextLine().split(" ");
        }
        int cur = Integer.parseInt(numbers[0]);
        int mx = cur;
        int mn = cur;
        for (int i = 1; i < n; i++) {
            cur = Integer.parseInt(numbers[i]);
            if (cur > mx) {
                mx = cur;
            }
            if (cur < mn) {
                mn = cur;
            }
        }
        System.out.println("최대값: " + mx);
        System.out.println("최소값: " + mn);
        scanner.close();
    }
}
