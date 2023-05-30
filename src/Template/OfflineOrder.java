package Template;

public class OfflineOrder extends OrderProcessing{
    int totalamt;

    public void selectItem()
    {
        System.out.println("Selected Items prices- 200, 400, 500");
        totalamt=200+400+500;
    }
    public void doPayment()
    {
        System.out.println("Bill Amount: "+totalamt);
        System.out.println("Pay through cash");
    }
    public void doDelivery()
    {

        System.out.println("Collect at Store");
    }
}
