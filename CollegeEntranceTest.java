import java.util.Scanner;
public class CollegeEntranceTest {
public static void main(String[] args) {
    String valdictorian;
    double gpa;
    int totalStudents,satScore;
    boolean qualify=false;

    Scanner reader= new Scanner(System.in);
    System.out.println("this program will determine if you can get into institut teknologi dirgantara adisucipto");
    System.out.println("Please answer the following question.");
    System.out.println("Berapa banyak siswa yang bersekolah di sekolah Anda? ");
    totalStudents=reader.nextInt();

    if(totalStudents>=1400)
    {
        System.out.println("Were you valdictorian or salutatorian of your school? Answer Y/N");

        valdictorian=reader.next();
        if(valdictorian.equals("y"))
        qualify=true;
    }
    if(qualify)
    {
        System.out.println("What was your grade point average on a 4.0 scale?");
        gpa=reader.nextDouble();
        System.out.println("What was your SAT score? ");
        satScore=reader.nextInt();
        if(gpa>=4.0 && satScore>=1100 ||gpa>=3.5 && satScore>=1300 ||gpa>=3.0 && satScore>=1500)
        qualify=true;
    }

    if(qualify)
    System.out.println("Coungratulation! You qualify for institut teknologi dirgantara adisucipto");
    else
    System.out.println("Sorry you do not qualify for intstitut teknologi dirgantara adisucipto");

}//end of main
}//end of clas
