//I hereby declare upon my word of honor that I have neither given nor received unauthorized help on this work.
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
public class UserClass
{

    public UserClass()
    {
        boolean yesno = checkForFile();
        if (yesno == false){makeFile();}

        int cont = 0;
        while (cont == 0){

            loop();
            cont++;

        }

    }

    private static void loop()
    {
        Scanner scan = new Scanner (System.in);
        int flag = 0;
        String read = "read";
        String enter = "enter";
        String sell = "sell";
        String display = "display";
        String quit = "quit";
        String sortname = "sortname";
        String sortnumber = "sortnumber";
        Inventory inv = new Inventory();
        BikePart bpart = new BikePart();
        while (flag == 0){

            System.out.println("Please select your option from the following menu:");
            System.out.println("Read: Read an inventory delivery file");
            System.out.println("Enter: Enter a part");
            System.out.println("Sell: Sell a part");
            System.out.println("Display: Display a part");
            System.out.println("SortName: Sort parts by part name");
            System.out.println("SortNumber: Sort parts by part number");
            System.out.println("Quit:");
            System.out.println("Enter your choice:");
            String input = scan.nextLine();
            input = input.toLowerCase();

            if (input.equals(read))
            {
                // ReadTextFile help = new ReadTextFile();
                // help.;
            }
            else if (input.equals(enter))
            {
                bpart.enter();
            }
            else if (input.equals(sell))
            {
               
                String partNUM = scan.nextLine();
                bpart.sell(partNUM);
            }
            else if (input.equals(display)){
                System.out.println("Please enter part name.");
                String part = scan.nextLine();
                inv.display(part);}
            else if (input.equals(sortname))
            {
                //need array list
                //inv.sortName();
                bpart.doThis();
            }
            else if (input.equals(sortnumber))
            {
                //need array list
                //inv.sortNum();
                bpart.doThisToo();
            }
            else if (input.equals(quit)){flag++; quit();}
            else {System.out.println("I'm sorry, that is not a given choice. Please choose from the listed choices.");}
        }
    }

    private static boolean checkForFile()
    {
        File inv = new File("C:\\CollegeComputerScience\\COMPSCIPART2\\inventory.txt");
        boolean exists = inv.exists();
        if (exists == true)
        {return true;}
        else {return false;}
    }

    private static void makeFile()
    {
        File inv = new File("C:\\CollegeComputerScience\\COMPSCIPART2\\inventory.txt");
    }

    private static void quit()
    {
        BikePart bpart = new BikePart();
        bpart.writeTo();
    }

    
    //for whereever final array list is, need to adjust from display when i had it in there
    
}
