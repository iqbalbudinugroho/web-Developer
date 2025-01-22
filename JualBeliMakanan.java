
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JualBeliMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> menu = new HashMap<>();
        menu.put("soto", 15000);
        menu.put("mie ayam", 13000);
        menu.put("bakso", 1000);
        menu.put("es teh", 3000);
        
        System.out.println(" ==== selamat datang di restoran warung iqbal === ");
        System.out.println(" silahkan pilih Menu makanan: ");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.printf("%s - Rp %d%n", entry.getKey(), entry.getValue());  
        }
        
        System.out.println("Masukan nama makanan yang ingin dibeli");
        String pilihanMakanan = scanner.nextLine();

        if(!menu.containsKey(pilihanMakanan)){
            System.out.println("Makanan tidak tersedia didalam menu. ");
            scanner.close();
            return;
        }
        System.out.println("Masukan jumlah yang ingin dibeli: ");
        int JumlahMakanan = scanner.nextInt();

        int hargaMakanan = menu.get(pilihanMakanan);
        int totalHarga = hargaMakanan*JumlahMakanan;
        System.out.printf("Total harga untuk %d %s: Rp %d%n", JumlahMakanan, pilihanMakanan, totalHarga);

        System.out.println("Masukan Jumlah uang yang diberikan: Rp ");
        int uangDiberikan = scanner.nextInt();

        if(uangDiberikan < totalHarga){
            System.out.println("Uang yang diberikan tidak cukup! ");
        } else {
            int kembalian = uangDiberikan - totalHarga;
            System.out.printf("kembalian: Rp %d%n", kembalian);
        }
        scanner.close();

    }

}

