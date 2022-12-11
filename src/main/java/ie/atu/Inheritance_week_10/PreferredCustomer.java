package ie.atu.Inheritance_week_10;

public class PreferredCustomer extends Customer{
    private static final int purchases = Integer.parseInt("500");
    private static final int discounts = Integer.parseInt("5");

    public PreferredCustomer(String purchases, String discounts) {
        super(purchases, discounts, "0694206969", "abc", true, "500", "5");           //go to the parent
    }

    public static void main(String[] args) {
        double Total;
        System.out.println("\nPurchases = "+purchases);
        System.out.println("Discount = "+discounts);
        double s = 100 - discounts;
        Total = (s*purchases)/100;
        System.out.println("amount after discounts = "+Total);
    }

    @Override
    public String toString() {
        return " Preferred Customer " + super.toString() + " " +
                "Customerpurchases ='" + purchases + '\'' +
                ", Customerpdiscounts =" + discounts +
                '}';
    }
}
