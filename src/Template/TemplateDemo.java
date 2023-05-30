package Template;

public class TemplateDemo {
    public static void main(String args[])
    {
        System.out.println("Online Order Processing: ");
        OrderProcessing online = new OnlineOrder();
        online.processOrder();
        System.out.println();
        System.out.println("Offline Order Processing: ");
        OrderProcessing offline = new OfflineOrder();
        offline.processOrder();
    }
}
