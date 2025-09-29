package Week_4.com;

interface Payment {
    void pay();
    void refund();
}


class  CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("pay via CreditCard");
    }

    @Override
    public void refund() {
        System.out.println("refund via CreditCard");
    }
}


class  UPIPayment implements  Payment{

    @Override
    public void pay() {
        System.out.println("pay via UPIPayment");
    }

    @Override
    public void refund() {
        System.out.println("refund via UPIPayment");
    }
}

class  PaymentMain{
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay();
        payment.refund();

        System.out.println("------------------------------------------");

        payment = new UPIPayment();
        payment.refund();
        payment.pay();
    }
}