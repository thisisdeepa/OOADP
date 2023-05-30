package Template;

public abstract class OrderProcessing {
    public final void processOrder(){
        selectItem();
        doPayment();
        doDelivery();

    }
    abstract void selectItem();
    abstract void doPayment();
    abstract void doDelivery();
}
