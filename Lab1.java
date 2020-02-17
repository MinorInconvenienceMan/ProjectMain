import java.util.*; 
public class Lab1
{
    public Lab1()
    {
       String x = "EDD";
       
       LinkedList<String> rhyme = new LinkedList<String>(); 
       rhyme.add("red");
       rhyme.add("bed");
       rhyme.add("bread");
       rhyme.add("bred");
       rhyme.add("said");
       rhyme.add("ted");
       rhyme.add("thread");
       rhyme.add("fed");
       rhyme.add("sped");
       rhyme.add("wed");
       
       int size = rhyme.size();
       
       System.out.println("Size is: " + size);
       System.out.println(rhyme);
       
       rhyme.add(2, x);
       size = rhyme.size();
       System.out.println("Size is: " + size);
       System.out.println(rhyme);
       rhyme.removeFirst();
       
       size = rhyme.size();
       System.out.println("Size is: " + size);
       System.out.println(rhyme);
       
       
    }
}
