import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class Testlogin {
    
    private static final String USSERNAME = "ananda putri lovinda";
    private static String PASSWORD = "Iqbalganteng";
    

    public Testlogin() {

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" masukan ussername: ");
        PASSWORD = scanner.nextLine();

        System.out.println( " masukan password: ");
        String inputpassword = scanner.nextLine();


        if (authenticate(password, inputpassword)) {
            System.out.println("Login berhasil. Selamat datang, " + username + "!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
        
        

    }
}
