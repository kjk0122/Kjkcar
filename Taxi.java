package transport;

public class Taxi extends Transportation {//        - 포함해야 할 정보
    Taxi(int number) {

        this.fuelAmount = 100;//    - 주유량 = 100
        this.speed = 0;           //  -속도 = 0

        this.customer = 0;
        this.maxCustomer = 4; //    - 최대 승객 수 = 4

        this.fare = 3000;        //    - 기본 요금 = 3000
        this.fareAdd = 1000;   //    - 거리당 요금 = 1000
        this.baseDest = 1;    //    - 기본 거리 = 1

        this.status = statusindex[1];
        System.out.println(number+"번 택시 추가되었습니다.");
    }

}
