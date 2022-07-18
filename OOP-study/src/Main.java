public class Main {
    public static void main(String[] args) {
        TV1 tv1 = new TV1(20, 3, "black");   // 생성자를 이용한 인스턴스 초기화
        TV1 tv2 = new TV1(30, 4, "Red");
        tv1.channelUp();                                        // channelUp 메서드 호출
        System.out.println("현재 채널은 " + tv1.channel + " 입니다.");
        System.out.println("tv2의 색깔은 " + tv2.channel + " 입니다.");
    }
}

class TV1 {
    int size;
    int channel;
    String color;

    public TV1(int size, int channel, String color) {  //인스턴스 초기화 생성자
        this.size = size;                            //this -> TV1인스턴스를 가리킴
        this.channel = channel;
        this.color = color;
    }

    public void channelUp() {                          //chnnel을 1씩 올려주는 메서드
        channel += 1;

    }
}