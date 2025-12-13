package five;

public class CustomExceptionDemo {
    static void deposit(int amount) throws InvalidAmountException{

        if(amount <= 0){
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        System.out.println("Amount deposited");
    }

    public static void main(String[] args) {
        try{
            deposit(-50);
        }
        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
    }
}
