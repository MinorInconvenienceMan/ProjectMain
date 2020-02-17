//I hereby declare upon my word of honor that I have neither given nor received unauthorized help on this work.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Arrays;
/**
 *
 * @author Sarah
 */
public class Inventory {
    ArrayList<String> db = new ArrayList<>();
    int b = db.size();

    public void display(String p){
        int z = 0;
        for(int i=0;i<b;i++){
            String s = db.get(i);
            if (s.contains(p)){
                String[] det = s.split(",");
                System.out.print(det[0]+", ");
                String m = det[4];
                if (m.equals("true")){
                    System.out.print(det[3]);}
                else
                    System.out.print(det[2]);
            }
            else
                z++;

        }
        if (z == b){
            System.out.println("Part not found.");
        }
    }

    public ArrayList<String> sortName(ArrayList a){
        int i;
        int j;
        String temp;
        for (i = 0; i < b; i++) {
            for (j = i + 1; j < b; j++) { 
                String[] str = new String[b];
                str[i] = db.get(i); 
                if (str[i].compareTo(str[j]) > 0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println();
        return db;
    }

    public ArrayList<String> sortNum(ArrayList a){
        int i;
        int j;
        for(i=0;i<b-1;i++){
            for (j=0;j<b-i-1;j++){
                String e = db.get(i);
                String f = db.get(i+1);
                String[] g = e.split(",");
                String[] h = f.split(",");
                int first = Integer.parseInt(g[1]);
                int sec = Integer.parseInt(h[1]);
                if (first>sec){
                    Collections.swap(db,i,i+1);

                }
            }
        }
        System.out.println();
        return db;
    }
}