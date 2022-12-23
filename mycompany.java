package car;

public class mycompany {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus1 = new Bus();
        bus.setInfo(100,300, 30);
        bus.chSpd(5);
        System.out.println(bus.getSpeed());


//        bus.setWarn(0); 연료 경고
    }
}
