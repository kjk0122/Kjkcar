package transport;

import java.util.UUID;

public class Transportation {
                    //    - 요소

    String uuid = UUID.randomUUID().toString();//    번호
    int fuelAmount;//    주유량
    int speed;//    속도
    int maxCustomer;//    최대 승객 수
    int customer; // 현재 승객
    int fare; //요금
    int fareAdd;//추가요금
    int baseDest;

    String[] statusindex = {"운행", "일반", "운행불가"}; //상태
    String status=statusindex[0];
    public void chSpd(int ud) {
        if(this.totalWarn(this.customer,this.fuelAmount)==0){
            System.out.println("기존 속도: "+this.speed);
            this.speed=this.speed+ud;
            System.out.println("변경된 속도: "+this.speed);
        }
    }

    public int fuelWarn(int f) {
        this.fuelAmount = f;
        if (this.fuelAmount <= 0) {
            this.status = statusindex[2];
            System.out.println("현재 연료가 "+this.fuelAmount+"이라서 장비를 정지합니다.\n"+this.status);
            return 1;
        } else if (this.fuelAmount < 10) {
            System.out.println("주유가 필요하다! 지금 기름 양: "+this.fuelAmount);
        } else{
            System.out.println("OK! 기름 양: " + this.fuelAmount);
        }
        return 0;
    }
    public int overWarn(int customer) {
        if(this.statusindex.equals("운행")) {
            this.customer = customer;
            if (this.customer > this.maxCustomer) {
                System.out.println("정원 초과!!!  "+ this.customer);
                System.out.println("수용가능최대인원: " + this.maxCustomer);
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
