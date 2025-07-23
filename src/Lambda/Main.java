package Lambda;


public class Main {

    public static void main(String[] args) { // This is the main method
        Answerable phone = () -> {
            return "Hello";
        };
        System.out.println(phone.answer());
    }
}
