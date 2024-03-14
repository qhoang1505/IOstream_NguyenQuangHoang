import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BT1_IOStream {
    public static void main(String [] args) {
        System.out.println("Vui lòng nhập đường dẫn");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if (file.exists()) {
            long filesize = file.length();
            System.out.println("Kích thước của file là: " + filesize + " bytes");
        } else {
            System.out.println("File không tồn tại hoặc đường dẫn không đúng!");
        }
    }
}
