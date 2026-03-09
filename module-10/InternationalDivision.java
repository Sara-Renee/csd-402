// Sara White - Module 10.2 - CSD-402 //

public class InternationalDivision extends Division {

    // fields specific to InternationalDivision
    private String country;
    private String language;

    // constructors
    public InternationalDivision(String divName, String acctNumber, String country, String language) {
        // call constructor from division superclass
        super(divName, acctNumber);
        
        this.country = country;
        this.language = language;
    }

    // Display info for international division - use @override to indicate this method is overriding the method defined in the superclass
    @Override
    public void display() {
        System.out.println("\n----------------------\nInternational Division\n----------------------"); //formatting for readability
        System.out.println("Division Name: " + divName);
        System.out.println("Account Number: " + acctNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language + "\n----------------------");
        System.out.println();
    }
}