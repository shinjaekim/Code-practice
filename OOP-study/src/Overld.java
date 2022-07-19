//  오버로딩
public class Overld {
    public static void main(String[] args){
        Info device = new Info(15, "high", "yellow", 2018);

        device.ct(device.inch);
        device.ct(device.performance);
        device.ct(device.color,device.year);

    }
}

class Info{
    int inch;
    String performance;
    String color;
    int year;

    public Info(int inch, String performance, String color, int year){
        this.inch = inch;
        this.performance = performance;
        this.color = color;
        this.year = year;
    }
    public void ct(int inch){
        System.out.println(inch + "인치 입니다.");
    }
    public void ct(String performance) {
        System.out.println(performance);
    }
    public void ct(String color, int year){
        System.out.println(color + "색이고," + year + "에 제작되었습니다.");
    }
}
/*
"한 클래스 내"에서 "같은 이름의 메서드 여러개" 정의
- 근본적으로 같은 기능, 하지만 인자가 다를때

오버로딩의 조건
1. 같은 메서드 이름
2. 다른 매개변수 타입 or 다른 매개변수 개수
 */