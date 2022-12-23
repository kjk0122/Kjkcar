package car;

import java.util.UUID;

public class Taxi {//        - 포함해야 할 정보

    String uuid = UUID.randomUUID().toString();     //1. 고유번호
    int fuelAmount = 0; //        2. 주유량
    int speed = 0;      //        3. 현재 속도
                            //         4.목적지(입력하는 방식으로)
    int destBasic;      //        5. 기본거리
                           //        6. 목적지까지 거리(4와 연계되어서 똑같이 입력되는 방식으로)
    int fareBasic;      //        7. 기본 요금
    int fareAdd;        //         8. 추가 요금
    String[] status = {"운행 중", "일반", "운행불가"}; //          9.  운행, 차고지 행
    String current = status[1];  //현재상태


    public void setInfo(int fuel, int db, int fare, int add) {
        this.fuelAmount = fuel;
        this.destBasic=db;
        this.fareBasic = fare;
        this.fareAdd = add;
    }


    public void chSpd(int ud) {
        if (this.fuelCheck() == 0) {
            System.out.println("기존 속도: " + this.speed);
            this.speed = this.speed + ud;
            System.out.println("변경된 속도: " + this.speed);
        }
    }

    public int fuelCheck() {
        if (this.fuelAmount <= 0) {
            current = status[2];
            System.out.println("현재 연료가 " + this.fuelAmount + "이라서 장비를 정지합니다.\n" + this.current);
            return 1;
        } else if (this.fuelAmount < 10) {
            System.out.println("주유가 필요하다! 지금 기름 양: " + this.fuelAmount);
            return 1;
        } else {
            System.out.println("출발 OK! 기름 양: " + this.fuelAmount);
        }
        return 0;
    }

    public int peopleCheck() {
        if (this.current.equals("일반")) {
            this.current = status[0];
            System.out.println("탑승!");
            return 0;
        } else {
            System.out.println("탑승불가... ");
        }
        return 1;
    }

    public int fee(int d){
        if(d<this.destBasic){
            System.out.println("기본요금: "+this.fareBasic);
            return this.fareBasic;
        }else{
            int a=d-this.destBasic;
            int aa=a*(this.fareAdd)+this.fareBasic;
            System.out.println("총요금: "+aa);
            return aa;
        }
    }
}
