public class Phone {
    static String country;
    String number;
    String type;
    double weight;

    public Phone() {
    }

    public Phone(String number, String type, double weight) {
        this.number = number;
        this.type = type;
        this.weight = weight;
    }

    public void receiveCall(String name){
        receiveCall(name , "");
    }

    public void receiveCall(String name , String number){
        System.out.println("Calling " + name + (number == " " ? " " : " number " + number));
    }
}
