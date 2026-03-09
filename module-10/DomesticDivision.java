// Sara White - Module 10.2 - CSD-402 //

public class DomesticDivision extends Division {

    // state field specific to domestic division
    private String state;

    // constructors
    public DomesticDivision(String divName, String acctNumber, String state) {
        // call constructor from division superclass
        super(divName, acctNumber);
        this.state = state;
    }

    // Display info for domestic division
    @Override
    public void display() {
        System.out.println("\n----------------------\nDomestic Division\n----------------------");
        System.out.println("Division Name: " + divName);
        System.out.println("Account Number: " + acctNumber);
        System.out.println("State: " + state + "\n----------------------");
        System.out.println();
    }
}