package Task2;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
        String s="1;2;3;4";

        List<Integer> list=getList(s);

        for (int i : list) {
            System.out.print(i+",");
        }

    }

    static List<Integer> getList(String s){

        List<Integer> list=new ArrayList<>();

        for (String value : s.split(";")) {
            list.add(Integer.parseInt(value));
        }
        return list;
    }

}
