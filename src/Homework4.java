import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // version 1. 재귀호출
        int result1 = gcd(m, n);
        System.out.println("두 수의 최대공약수는 " + result1 + "입니다.");

        // version 2. 반복문
//        int result2 = gcdIter(m, n);
//        System.out.println("두 수의 최대공약수는 " + result2 + "입니다.");

        scanner.close();
    }

    static int gcd(int m, int n) {
        if (n == 0) return m;
        int _min = Math.min(m, n);
        int _max = Math.max(m, n);
        return gcd(_min, _max % _min);
    }

    static int gcdIter(int m, int n) {
        int _min, _max;
        while (n != 0) {
            _min = Math.min(m, n);
            _max = Math.max(m, n);
            int temp = _max % _min;
            m = _min;
            n = temp;
        }
        return m;
    }
}
