package ie.atu.Inheritance_week_10;

public class Person {
    private String name;
    private String address;
    private String number;
    private int purchases;
    private int discounts;

    public Person(){
    }

    public Person(String name, String address, String number, int purchases, int discounts) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.purchases = purchases;
        this.discounts = discounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getnumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


  //deleted line here (override)

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int discounts) {
        this.discounts = discounts;
    }

    @Override
    public String toString() {
        return " {" +
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", number = '" + number + '\'' +
                ", purchases = '" + purchases + '\'' +
                ", discounts = '" + discounts + '\'' +
                '}';
    }

}
