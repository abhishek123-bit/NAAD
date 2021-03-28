package Task3_3;



public class Main {
    public static void main(String[] args) {
        TouristPlace rajasthan= new TouristPlace("Jaipur","7:00AM to 5:00PM",20);
        rajasthan.addFamousFor("Pink City");
        rajasthan.rate(5);
        rajasthan.rate(6);
        rajasthan.rate(8);
        rajasthan.rate(10);
        rajasthan.rate(20);
        System.out.println(rajasthan.starRating);

    }
}
