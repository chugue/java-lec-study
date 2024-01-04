package coffee;

public class Coffee {
    String status = "preparing";
    int water_ml;
    int shots;
    int milk_ml;
    int caramel_sp;

    public Coffee(int choice) {
        switch (choice){
            case 0:
                    americano();
                    break;
            case 1:
                    macchiato();
                    break;
            case 2:
                    cafelatte();
                    break;
            case 3:
                    espresso();
                    break;
            default : 
                System.out.println("잘못된 번호를 선택하셨습니다.");
        }
    }

    public void americano (){
        water_ml = 300;
        shots = 2;
        milk_ml = 0;
        status = "아메리카노 조리가 완료되었습니다";
    }
    public void macchiato (){
        water_ml = 100;
        shots = 2;
        milk_ml = 400;
        caramel_sp = 3;
        status = "마끼아또 조리가 완료되었습니다.";

    }
    public void cafelatte (){
        water_ml = 100;
        shots = 2;
        milk_ml = 400;
        status = "카페라떼 조리가 완료되었습니다.";
    }
    public void espresso (){
        water_ml = 100;
        shots = 2;
        status = "에스프레소 조리가 완료되었습니다.";
    }

}
