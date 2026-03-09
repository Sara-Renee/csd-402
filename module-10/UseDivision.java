// Sara White - Module 10.2 - CSD-402 //

public class UseDivision {

    public static void main(String[] args) {


        // create two instances of InternationalDivision
        InternationalDivision globalDiv1 = new InternationalDivision("Western Europe Operations", "WEO111F", "France", "French");
        InternationalDivision globalDiv2 = new InternationalDivision("East Asia Operations", "EAO222J", "Japan", "Japanese");


        // two instances of DomesticDivision
        DomesticDivision USDiv1 = new DomesticDivision("Midwest Operations", "US111NE", "Nebraska");
        DomesticDivision USDiv2 = new DomesticDivision("West Coast Operations", "US222CA", "California");

        // call display method for each division
        globalDiv1.display();
        globalDiv2.display();
        USDiv1.display();
        USDiv2.display();
    }
}