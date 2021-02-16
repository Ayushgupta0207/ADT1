import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = kb.nextInt();
        for(int i=0 ;i <n;i++){
            int t= kb.nextInt();
            list.add(t);
        }
        int q = kb.nextInt();
        for(int i=0;i<q;i++){
            String a = kb.next();
            if (a.equals("Insert")){
                int x = kb.nextInt();
                int y = kb.nextInt();
                list.add(x,y);
            }
            if (a.equals("Delete")){
                int y = kb.nextInt();
                list.remove(y);
            }

        }
        for (Integer integer: list)
              {
                  System.out.print(integer+" ");
        }
    }
}