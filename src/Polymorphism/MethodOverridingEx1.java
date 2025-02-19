package Polymorphism;


abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPal extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class MethodOverridingEx1 {
	public static void main(String[] args) {
        Payment payment;

        payment = new CreditCard();
        payment.pay(100.50);

        payment = new PayPal();
        payment.pay(200.75);
    }
}

