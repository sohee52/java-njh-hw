import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int ID = Integer.parseInt(parts[0]);
            String name = parts[1];
            String major = parts[2];
            String phone = parts[3];
            students[i] = new Student(ID, name, major, phone);
        }
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        String[] sequence = {"첫번째", "두번째", "세번쨰"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(sequence[i] + " 학생: " + students[i].getID() + " " + students[i].getName() +  " " + students[i].getMajor() + " " + students[i].getPhone());
        }

        scanner.close();
    }
}

class Student {
    int ID;
    String name;
    String major;
    String phone;

    public Student(int ID, String name, String major, String phone) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.phone = phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
