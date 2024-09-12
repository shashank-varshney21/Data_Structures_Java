import java.util.*;
public class Linked_list {
    public static void main(String[] args)
    {
        LinkedList<String> lst = new LinkedList<>();
        lst.push("Shashank");
        lst.push("is");
        lst.push("Founder");
        lst.push("of Saka");
        String[] abc = new String[4];
        for (int i=0;i<4;i++)
        {
          abc[i]=lst.pop();
        }
        for (int j =0;j<4;j++)
        {

            System.out.println(abc[j]);
        }
    }
}
