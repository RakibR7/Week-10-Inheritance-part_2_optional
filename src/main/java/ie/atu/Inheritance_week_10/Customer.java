package ie.atu.Inheritance_week_10;

public class Customer extends Person {
    private String customerNumber;
    private boolean mailingList;
    private int purchases;
    private int discounts;

    public Customer(String purchases, String discounts, String number, String abc, boolean mailingList, String s, String s1) {
    }

    public Customer(String name, String address, String number, String customerNumber, boolean mailingList,int purchases, int discounts) {
        super(name, address, number, purchases, discounts);           //go to the parent
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }


    @Override
    public String toString() {
        return " Customer " + super.toString() + " " +
                "customerNumber ='" + customerNumber + '\'' +
                ", mailingList =" + mailingList + '\'' +
                ", Purchases =" + purchases + '\'' +
                ", Discounts =" + discounts + '\'' +
                '}';
    }
}
