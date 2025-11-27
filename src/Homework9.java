import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Users9 users9 = new Users9();
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();
            if (!users9.hasId(inputId)) System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            else {
                System.out.print("password : ");
                String inputPw = sc.nextLine().trim();
                if (users9.correctPassword(inputId, inputPw)) {
                    System.out.println("id와 비밀번호가 일치합니다."); break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
        }
    }
}

class Users9 {
    private Map<String, String> map;

    public Users9() throws IOException {
        this.map = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] list = line.split(",");
                if (list.length != 2) continue;
                map.put(list[0].trim(), list[1].trim());
            }
        } catch(IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다: " + e.getMessage());
        }

    }

    public boolean hasId(String inputId) {
        return map.containsKey(inputId);
    }

    public boolean correctPassword(String inputId, String inputPw) {
        String password = map.get(inputId);
        if (password.equals(inputPw)) return true;
        return false;
    }
}
