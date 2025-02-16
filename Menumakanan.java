import java.awt.Menu;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Menumakanan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String>menu = new ArrayList<>();
        menu.add("1.nasi - Rp 10.000");
        menu.add("2.gado-gado - Rp 15.000");
        menu.add("3.sate - Rp 20.000");
        menu.add("nasi teri  - Rp 12.000");

        Scanner input = new Scanner(System.in);
        int pilihan;

        while(true){
            System.out.println(" ==== Menu Makanan ====");
            for(String item : menu){
                System.out.println(item);
            }
            System.out.println(" 6.Keluar ");
            System.out.println(" ========================");
            System.out.println(" Masukan nomor menu yang ingin anda pilih (1-6): ");
            pilihan = scanner.nextInt();
            for (Map.Entry<String, interger> entry : menu.entrySet()) {
        }
    }
}
}