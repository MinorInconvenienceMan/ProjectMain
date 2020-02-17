//I hereby declare upon my word of honor that I have neither given nor received unauthorized help on this work.
import java.util.Random;
public class Gerbil
{
    public static void main()
    {
        Random rand = new Random();
        int Rhodium = rand.nextInt(6); 
        int Platinum = rand.nextInt(6); 
        int Gold = rand.nextInt(6); 
        int Ruthenium = rand.nextInt(6);
        int a = 0;
        //System.out.println(Rhodium);
        while (a < 5) {
            Rhodium = rand.nextInt(6); 
            Platinum = rand.nextInt(6); 
            Gold = rand.nextInt(6); 
            Ruthenium = rand.nextInt(6);
            found(Rhodium, Platinum, Gold, Ruthenium); 
            a++;
        }
    }

    public static void found(int rhodium, int platinum, int gold, int ruthenium)
    {
        int rhCount = 0;
        int rhTotal = rhodium;
        int pCount = 0;
        int pTotal = platinum;
        int gCount = 0;
        int gTotal = gold;
        int ruCount = 0;
        int ruTotal = ruthenium;
        int gerbilMax = 0;
        //int flag = 0;

        if (rhodium >= 1){
            while(rhTotal > 0)
            {

                if (gerbilMax == 10){break;}
                else {gerbilMax++;
                }
                rhCount++;
                rhTotal--;
            }
        }
        if (platinum >= 1){
            while(pTotal > 0)
            {
                if (gerbilMax == 10){break;}
                else {gerbilMax++;
                }
                pCount++;
                pTotal--;
            }
        }
        if (gold >= 1){
            while(gTotal > 0)
            {
                if (gerbilMax == 10){break;}
                else {gerbilMax++;
                }
                gCount++;
                gTotal--;
            }
        }
        if (ruthenium >= 1){
            while(ruTotal > 0)
            {
                if (gerbilMax == 10){break;}
                else {gerbilMax++;
                }
                ruCount++;
                ruTotal--;
            }

        }
        System.out.println("found(" + rhodium + ", " + platinum + ", " + gold + ", " + ruthenium + ")");
        System.out.println(rhCount + " Rhodium");
        System.out.println(pCount + " Platinum");
        System.out.println(gCount + " Gold");
        System.out.println(ruCount + " Ruthenium");
        System.out.println();
    }
}
