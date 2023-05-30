package Template;

public class OnlineOrder extends OrderProcessing{
    int totalamt;
    public void selectItem()
    {
        System.out.println("Items selected price: 200,500,350");
        totalamt=200+500+350;
    }
    public void doPayment()
    {
        System.out.println("Bill Amount: "+totalamt);

        System.out.println("Pay via UPI");
    }
    public void doDelivery()
    {
        System.out.println("Delivery to RIT, Total Amount to be Paid: "+totalamt);
    }
}
