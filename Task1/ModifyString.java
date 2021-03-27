package Task1;

import java.util.HashMap;

public class ModifyString {
    public static void main(String[] args) throws InvalidReplacementsException {
        String str="12332321";
        String replacements="2R3S4D1T";

        System.out.println(modifyString(str,replacements));
    }

    static String modifyString(String str, String replacements) throws InvalidReplacementsException {


       HashMap<Integer,Character> hashMap=new HashMap<>();

        for (int i = 0; i <replacements.length() ; i+=2) {
            hashMap.put(Integer.parseInt(""+replacements.charAt(i)),replacements.charAt(i+1));
        }
        for (int i = 0; i <str.length() ; i++) {
            if(!hashMap.containsKey(str.charAt(i)-48)){
                throw new InvalidReplacementsException("replacement for a digit in s is not given in replacements string");
            }
        }
        for (int i = 0; i <replacements.length() ; i+=2) {
            if(replacements.charAt(i)-48>=0&&replacements.charAt(i)-48<=9){
                throw new InvalidReplacementsException("replacements string is invalid");
            }
        }

        StringBuilder newStr= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
               newStr.append(hashMap.get(Integer.parseInt("" + str.charAt(i))));
        }
        return newStr.toString();
    }
}
