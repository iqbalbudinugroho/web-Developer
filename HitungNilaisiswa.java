import java.text.DecimalFormat;
import java.util.Scanner;

public class HitungNilaisiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukan nama siswa: ");
        String nama = input.nextLine();

        System.out.println(" Masukan absen siswa : ");
        String absen = input.nextLine();

        System.out.println(" Masukan nilai tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.println(" Masukan nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.println(" Masukan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double bobotTugas = 0.2;
        double bobotUTS = 0.3;  
        double bobotUAS = 0.5;

        double nilaiAkhir = (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        String keterangan = (nilaiAkhir >= 50) ? "lulus": "Tidak lulus";
        System.out.println(" Nilai akhir :" + nilaiAkhir);

        DecimalFormat df = new DecimalFormat();
        String nilaiAKhirBulat = df.format(nilaiAkhir);

        System.out.println(" nama siswa: " + nama);
        System.out.println(" absen siswa: " + absen);

        if(nilaiAkhir >=85){
            System.out.println(" Grade: A");
        } else if (nilaiAkhir >= 75){
            System.out.println(" Grade: B");
        } else if( nilaiAkhir >= 65){
            System.out.println(" Grade: C ");
        } else if( nilaiAkhir >= 55){
            System.out.println(" Grade: D ");
        } else {
            System.out.println(" Grade: E ");
        }
        input.close();
    }
}
