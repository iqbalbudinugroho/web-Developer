import java.text.DecimalFormat;
import java.util.Scanner;


public class penilaianMahsiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukan nama mahsiswa ");
        String nama = input.nextLine();

        System.out.println(" Masukan NIM: ");
        String nim = input.nextLine();

        System.out.println(" Masukan Nilai Tugas (0-100): ");
        double nilaiTugas = input.nextDouble();
        if(nilaiTugas < 0 || nilaiTugas > 100 ) {
            System.out.println(" Nilai Tugas tidak valid harap masukan nilai antara 0 dan 100 ");
            return;
        }

        System.out.println(" Masukan Nilai UTS (0-100): ");
        double nilaiUTS = input.nextDouble();
        if( nilaiUTS < 0 || nilaiUTS > 100 ){
            System.out.println(" Nilai UTS tidak valid. harap masukan nilai antara 0 dan 100 ");
            return;
        }

        System.out.println(" Masukan nilai UAS (0-100): ");
        double nilaiUAS = input.nextDouble();
        if( nilaiUAS < 0 || nilaiUAS > 100 ){
            System.out.println(" Nilai UAS tidak valid. harap masukan nilai dari 0 sampai 100 ");
            return;
        }
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

        String Keterangan = (nilaiAkhir >= 50) ? "Lulus " : "Tidak Lulus";
        System.out.println("Nilai AKhir: " + nilaiAkhir);
        
        DecimalFormat df = new DecimalFormat("#.##");
        String nilaiAkhirBulat = df.format(nilaiAkhir);

        String Grade;
        if(nilaiAkhir >= 85){
            Grade = "A";
        } else if (nilaiAkhir >= 75){
            Grade = "B";
        } else if(nilaiAkhir >= 65){
            Grade = "c";
        } else if(nilaiAkhir >= 50){
            Grade = "D";
        } else {
            Grade = "E";
        }

        System.out.println(" \n-- Hasil penilaian --- ");
        System.out.println(" Nama Mahasiswa: " + nama);
        System.out.println(" NIM: " + nim);
        System.out.println(" Nilai Tugas: " + nilaiTugas);
        System.out.println(" Nilai UTS: " + nilaiUTS );
        System.out.println(" Nilai UAS: " + nilaiUAS);
        System.out.println(" Nilai AKhir: " + nilaiAkhirBulat);
        System.out.println(" Grade: " + Grade);
        System.out.println(" Keterangan: " + Keterangan );

        System.out.println(" \nApakah ingin memasukan data mahasiswa lain? (ya/tidak): ");
        String jawaban = input.nextLine();
        if(!jawaban.equalsIgnoreCase("ya")){
            boolean lanjut = false;
        }
        input.close();
        System.out.println(" program selesai. Terima kasih! ");
    }
}
