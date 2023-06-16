package day49;

public class Customer extends InsufficientBalanceException implements Accountable  {
    private int id;
    private String name;
    private Contact owner;
    private String address;
    private String phoneNumber;
    private static int ID_GENERATOR;

    private double balance;


    public Customer(String name) {
        this.name = name;
        this.id = ++ID_GENERATOR;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact contact) {
        this.owner = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

    @Override
    public void deposit(double amount) {
        balance += amount;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount>balance) throw new InsufficientBalanceException();
        balance -= amount;

    }
}
