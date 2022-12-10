package ie.atu.Inheritance_week_10;

public class  Fields {
    public static void main(String[] args) {
        Person dave = new Person();
        dave.setName("Dave");
        dave.setAddress("Mervue");
        dave.setNumber("1234");

        System.out.println("\nHere are Daves details" + dave.toString());

        //test customer
        Customer myCust = new Customer("dave","mervue","0694206969","abc",true);

        System.out.println("Here are the details" + myCust.toString());
    }
}





