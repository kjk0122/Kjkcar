package transport;

public class mycompany {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("설정된 고유번호는: "+bus.uuid);
        bus.setInfo(100,300, 20, 30); //인원, 가격, 연료, 속도 조절 탭이 있다.
        bus.chSpd(5);                   ///속도조절
//        bus.setWarn(0); 연료 경고
        Taxi taxi = new Taxi();
        taxi.setInfo(11,1000,2800, 50);
        taxi.fuelCheck();
    }
}
