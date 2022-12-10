package ie.atu.Inheritance_week_10;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList) {
        super(name, address, number);           //go to the parent
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }


    @Override
    public String toString() {
        return "Customer " + super.toString() + " " +
                "customerNumber ='" + customerNumber + '\'' +
                ", mailingList =" + mailingList +
                '}';
    }
}
