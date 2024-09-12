import java.util.*;
public class stack_cf {
    public static void main(String[] arg)
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(300);
        int[] abc = new int[3];
        abc[0]=s.pop();
        abc[1]=s.pop();
        abc[2]=s.pop();
        for(int i=0;i<3;i++)
        {
            System.out.println(abc[i]);
        }

    }
}

