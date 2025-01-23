
import java.util.Scanner;
public class diagnosa {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("== Sistem deteksi penyakit sederhana=== ");
    System.out.println("Jawab pertanyaan berikut dengan 'y'(ya) atau 'n' (tidak) ");
    
    System.out.println("apakah anda mengalami demam");
    char demam = scanner.next().charAt(0);
    
    System.out.println("Apakah anda mengalami batuk? ");
    char batuk = scanner.next().charAt(0);

    System.out.println(" Apakah anda merasa sesak napas?");
    char sesak = scanner.next().charAt(0);

    System.out.println(" Apakah anda merasa nyeri ditenggorokan?");
    char nyeriTenggorokan = scanner.next().charAt(0);

    System.out.println(" Apakah anda merasa lemas atau kelelahan? ");
    char lemas = scanner.next().charAt(0);

    System.out.println("\n== Hasil Diagmosis === ");
    if(demam == 'y' && batuk == 'y' && sesak == 'y'){
        System.out.println(" kemungkinan anda mengalami gejala Covid-19. segera konsultasikan ke dokter");   
    }else if (demam == 'y' && nyeriTenggorokan == 'y' && lemas == 'y'){
        System.out.println("Kemungkinan Anda mengalami gejala flu. istirahat yang cukup dan banyak minum air");
    }else if (nyeriTenggorokan == 'y' && batuk == 'y'){
        System.out.println("kemungkinan Anda mengalami radang tenggorokan. Hindari makanan berminyak.");
    }else if (lemas == 'y' && demam == 'y'){
        System.out.println("Kemungkinan anda mengalami kelelahan atau dehidrasi. minum air yang cukup dan periksa suhu tubuh.");
    }else {
        System.out.println("gejala anda tidak sesuai dengan pola penakit yang terdeteksi. sebaiknya konsultasikan dengan dokter  ");
    }

    System.out.println("\nTerima kasih telah menggunakan sistem ini. tetapi jaga keshatan! ");
    
}
}
