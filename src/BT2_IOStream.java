import java.io.File;
import java.util.Scanner;

public class BT2_IOStream {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("File không tồn tại hoặc đường dẫn không đúng!");
        }
    }
}
