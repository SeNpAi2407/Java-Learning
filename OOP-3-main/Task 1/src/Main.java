public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("8889997766", "Nokia", 20);
        phone.receiveCall("Oleg");

        Phone phone1 = new Phone("1112223344", "Motorolla", 30);

        Phone.country = "China";

        System.out.println(phone.country);
        System.out.println(phone1.country);
    }
}

