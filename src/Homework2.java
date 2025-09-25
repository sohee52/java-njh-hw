import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String major = parts[2];
            long phone = Long.parseLong(parts[3]);

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        String[] sequence = {"첫번째", "두번째", "세번째"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(sequence[i] + " 학생: "
                    + students[i].getID() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + students[i].getPhone());
        }

        scanner.close();
    }
}

class Student {
    private int id;
    private String name;
    private String major;
    private long phone;

    public Student(int id, String name, String major, long phone) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public String getPhone() {
        String p = String.format("%011d", phone);
        return p.substring(0, 3) + "-" + p.substring(3, 7) + "-" + p.substring(7);
    }

    public void setID(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setPhone(long phone) { this.phone = phone; }
}
