package car;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.UUID;

public class Bus {//        - 포함해야 할 정보
    int maxCustomer;//        1.  승객수
    int Customer; //        2. 현재 승객수
    int fare;           //        3. 요금
    String busuid;  //        4. 버스 번호

    int fuelAmount=30; //        5. 주유량
    int speed = 0;     //        6. 현재 속도
    String[] status = {"운행", "차고지 행"}; //          1.  운행, 차고지 행
    String current = "";  //현재상태

    public void setInfo(int max, int fare, int spd) {
        this.maxCustomer = max;
        this.fare = fare;
        this.speed=spd;
        String uuid = UUID.randomUUID().toString();
        this.busuid=uuid; this.current = status[0];
        System.out.println("임시 아이디가 생성되었습니다");
    }

    public int getSpeed() {
        return this.speed;
    }

    public void chSpd(int ud) {
        if(this.totalWarn(this.Customer,this.fuelAmount)==0){
            this.speed=this.speed+ud;
        }
    }

    public int fuelWarn(int f) {
        this.fuelAmount = f;
        if (this.fuelAmount <= 0) {
            current = status[1];
            System.out.println("현재 연료가 "+this.fuelAmount+"이라서 장비를 정지합니다.\n"+this.current);
            return 1;
        } else if (this.fuelAmount < 10) {
            System.out.println("주유가 필요하다");
        } else{
            System.out.println("기름 양 OK" + this.fuelAmount);
        }
        return 0;
    }
    public int overWarn(int Customer) {
        if(this.current=="운행") {
            this.Customer = Customer;
            if (this.Customer > this.maxCustomer) {
                System.out.println("정원 초과");
                return 1;
            }else {
                System.out.println("잔여석 있음");

            }
        }
        return 0;
    }
    public int totalWarn(int c, int f){
        if(this.overWarn(c)==0&&this.fuelWarn(f)==0){
            System.out.println("이상 없음!");
            return 0;
        }else{
            System.out.println("차에 문제가 있습니다!");
            return 1;
        }
    }
}
