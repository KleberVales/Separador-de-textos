package separador;

import java.util.*;

class SeparaTexto {
    public static String getSmallestAndLargest(String s, int k)
    {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for(int i=0;i<=s.length()-k;i++)
        {
            String substr = s.substring(i, i+k);
            
            if(substr.compareTo(largest) > 0)
                largest = substr;
            if(substr.compareTo(smallest) < 0)
                smallest = substr;
        }
        
        return smallest + "\n" + largest;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int k = sc.nextInt();
        
        sc.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}