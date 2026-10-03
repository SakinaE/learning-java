abstract class Payment{
    int amount;
    Payment(int amount){
        this.amount = amount;
    }
    abstract void pay();
}
class Creditcard extends Payment{
    Creditcard(int amount){
        super(amount);
    }
    void pay(){
        System.out.println("paid using credit card");
    }
}
class Debitcard extends Payment{
    Debitcard(int amount){
        super(amount);
    }
    void pay(){
        System.out.println("paid using debit card");
    }
}
public class Abstraction{
    public static void main(String[]args){
        Payment p1 = new Creditcard (500);
        p1.pay();
        Payment p2 = new Debitcard(500);
        p2.pay();
    }
}