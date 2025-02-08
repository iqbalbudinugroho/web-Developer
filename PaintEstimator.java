
import java.util.Scanner;
public class PaintEstimator {
    
    public static void main(String[] args) {
        double lenght,width,height,area,extraArea;
        
        int fiveLiter=0, oneLiter=0;

        Scanner reader=new Scanner(System.in);
        System.out.println("This program will determine the optimal amount of paint that should be purchased to paint to your room ");
        System.out.println("What is the height of the room?");
        height=reader.nextDouble();

        System.out.println("What is the widht of the room?");
        width=reader.nextDouble();

        System.out.println("What is the widht of the room?");
        lenght=reader.nextDouble();

        area=2*height*lenght+2*height*width + lenght*width;
        fiveLiter=(int)(area/1500);
        extraArea=area-fiveLiter*1500;
        oneLiter=(int)(extraArea/300);
        if(extraArea-oneLiter*300>0)
            oneLiter++;
        
        if(oneLiter>=4)
        {
            fiveLiter++;
            oneLiter=0;
        }
        System.out.println("You should buy + fiveLiter + five Liter buckets at $15 each");
        System.out.println("You should buy + oneLiter + one Liter buckets at $4 each");

    }//end of main
}
