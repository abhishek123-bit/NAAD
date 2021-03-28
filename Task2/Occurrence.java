package Task2;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
    public static void main(String[] args) {
        String s="2;2;3;4;1";
        HashMap<Integer, Integer> hashMap=getOccurrencesHashMap(s);

        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+", ");
        }
    }

    static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i+=2) {
            if(hashMap.containsKey(s.charAt(i)-48)){
                hashMap.put(s.charAt(i)-48, hashMap.get(s.charAt(i)-48)+1);
            }
            else {
                hashMap.put(s.charAt(i)-48,1);
            }
        }
        return hashMap;
    }
}
