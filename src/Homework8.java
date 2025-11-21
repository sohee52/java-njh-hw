import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users users = new Users();
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();
            if (!users.hasId(inputId)) System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            else {
                System.out.print("password : ");
                String inputPw = sc.nextLine().trim();
                if (users.correctPassword(inputId, inputPw)) {
                    System.out.println("id와 비밀번호가 일치합니다."); break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
        }
    }
}

class Users {
    private Map<String, String> map;

    public Users() {
        this.map = new HashMap<>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");
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
