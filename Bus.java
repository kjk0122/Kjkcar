package transport;

public class Bus extends Transportation{
    Bus(int number){

        this.fuelAmount=100;

        this.customer=0;
        this.maxCustomer=30; //최대 승객 수 = 30


        this.fare=1000; //요금 = 1000

        this.status=statusindex[0]; //상태 = 운행

        System.out.println(number+"번 버스 추가되었습니다.");
    }

}
