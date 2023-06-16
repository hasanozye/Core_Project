package day49;

public class MainApp {
    public static void main(String[] args) {
        Contact contact = new Contact("Hasan","5427877417");
        Customer customer = new Customer("Said");

        System.out.println("contact = " + contact);
        System.out.println("customer = " + customer);

        customer.deposit(12);
        try {
            customer.withdraw(150);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }


    }
}
