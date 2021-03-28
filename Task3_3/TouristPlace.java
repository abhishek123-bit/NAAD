package Task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    String name;
    String workingHour;
    int entryTicketPrice;
    int noOfRatings;
    int starRating;
    List<String> famousFor;
    public TouristPlace(String name,String workingHour,int entryTicketPrice){
        this.name=name;
        this.workingHour=workingHour;
        this.entryTicketPrice=entryTicketPrice;
        this.famousFor=new ArrayList<>();
        starRating=0;
        noOfRatings=0;
    }
    void rate(int starts){
        if(starts>starRating)
               starRating=starts;
        noOfRatings+=starts;
    }
   TouristPlace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }
    boolean isPlaceOpen(){
        return true;
    }

}
