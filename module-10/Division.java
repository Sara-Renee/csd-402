// Sara White - Module 10.2 - CSD-402 //

public abstract class Division {

    // all divisions share these fields
    protected String divName;
    protected String acctNumber;

    // constructor that requires division name and account number
    public Division(String divName, String acctNumber) {
        this.divName = divName;
        this.acctNumber = acctNumber;
    }

    // display method - defined in subclasses
    public abstract void display();
}