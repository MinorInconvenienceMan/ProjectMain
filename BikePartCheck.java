import java.util.Scanner;
import java.util.ArrayList;
public class BikePartCheck
{

    public static void main(String args[])
    {   Scanner scan = new Scanner (System.in);
        String partName;
        double partNumber;
        double listPrice;
        double salesPrice;
        boolean onSale;
        int lines;
        int tally = 0;
        // System.out.println("Part name:");
        // partName = scan.nextLine();
        // System.out.println("Part number:"); 
        // partNumber = scan.nextDouble();
        // System.out.println("Price:");
        // listPrice = scan.nextDouble();
        // System.out.println("Sales price:");
        // salesPrice = scan.nextDouble();
        // System.out.println("On sale, yes or no?");
        // String ans = scan.next();
        // if (ans.toLowerCase().matches("yes")){onSale = true;}
        // else {onSale = false;}
        // BikePart check = new BikePart(partName, partNumber, listPrice, salesPrice, onSale);
        // check.getpartName(partName);
        // System.out.println(partName);
        // check.getpartNumber(partNumber);
        // System.out.println(partNumber);
        // check.getlistPrice(listPrice);
        // System.out.println(listPrice);
        // check.getsalesPrice(salesPrice);
        // System.out.println(salesPrice);
        // check.getonSale(onSale);
        // System.out.println(onSale);

        //number of lines being written

        System.out.println("Number of lines being written:");
        lines = scan.nextInt();
        String lastFour;
        ArrayList<String> BikeParts = new ArrayList<String>();
        ArrayList<String> Numbers = new ArrayList<String>();
        while (lines >= tally)
        {
            String sentence = scan.nextLine();
            BikeParts.add(sentence);

            String nuon = sentence.replaceAll("[^0-9]", "");
            //System.out.println(nuon);
            Numbers.add(nuon);
            
            System.out.println(BikeParts);
           
            tally++;
        }

        
        // int all = 0;
        // while (Numbers.size() >= all)
        // {
        // if (Numbers.get(0) < 20){}
        // }
    }

}
