package car;

public class mycompany {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setCustomer(200,5000);
        System.out.println(bus.minCustomer+", "+bus.maxCustomer);
    }
}
