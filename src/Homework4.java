import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        String[] inputs = scanner.nextLine().split(" ");
        int m = Integer.parseInt(inputs[0]);
        int n = Integer.parseInt(inputs[1]);

        // version 1. 재귀호출
//        int result = gcd(m, n);
//        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        // version 2. 반복문
        while (n != 0) {
            int _min = m < n ? m : n;
            int temp = m % n;
            m = _min;
            n = temp;
        }
        System.out.println("두 수의 최대공약수는 " + m + "입니다.");

        scanner.close();
    }

    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        int _min = m < n ? m : n;
        return gcd(_min, m % n);
    }
}
