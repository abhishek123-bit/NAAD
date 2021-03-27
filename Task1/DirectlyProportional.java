package Task1;

public class DirectlyProportional {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,10,15,20,25};
        System.out.println(directlyProportional(a,b));
    }

    static boolean directlyProportional(int[] a, int[] b) {

        int proportional=b[0]/a[0];

        for (int i = 1; i <a.length ; i++) {
            if(b[i]/a[i]!=proportional){
                return false;
            }
        }
        return true;
    }
}
