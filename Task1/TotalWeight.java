package Task1;

import java.util.HashMap;

public class TotalWeight {
    public static void main(String[] args) {
        String str="EEDBCCAB";
        int[] weights={4, 3, 2, 1, 5};

        System.out.println(totalWeight(str,weights));
    }

     static int totalWeight(String str, int[] weights) {
        HashMap<Character,Integer> hashMap=new HashMap<>();


         for (int i = 0; i <weights.length; i++) {
             char ch='A';
             ch+=i;
             hashMap.put(ch,weights[i]);
         }


         int totalWeight=0;
         for (int i = 0; i <str.length() ; i++) {
             totalWeight+=hashMap.get(str.charAt(i));
         }
        return totalWeight;
    }
}
