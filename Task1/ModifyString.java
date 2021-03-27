package Task1;

import java.util.HashMap;

public class ModifyString {
    public static void main(String[] args) {
        String str="12332321";
        String replacements="2R3S1T4D";

        modifyString(str,replacements);
    }

    static void modifyString(String str, String replacements) {

       HashMap<Integer,Character> hashMap=new HashMap<>();

        for (int i = 0; i <replacements.length() ; i+=2) {
            hashMap.put(Integer.parseInt(""+replacements.charAt(i)),replacements.charAt(i+1));
        }

        StringBuilder newStr= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
               newStr.append(hashMap.get(Integer.parseInt("" + str.charAt(i))));
        }
        System.out.println(newStr);
    }
}
