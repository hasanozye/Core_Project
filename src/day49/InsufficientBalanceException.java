package day49;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(){
        super("Insufficient balance for the requested transaction.");

    }


}
