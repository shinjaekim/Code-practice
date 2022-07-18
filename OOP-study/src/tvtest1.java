//  클래스 - 객체 - 인스턴스 파악

public class tvtest1{
    public static void main(String[] args) {
        TV tv1 = new TV(20, 3, "black");     // 생성자를 이용한 인스턴스 생성 및 초기화
        tv1.channelUp();                                        // channelUp 메서드 호출
        System.out.print("현재 채널은" + tv1.channel + "입니다.");
    }
}

class TV{     // TV객체를 생성하기 위한 설계도
    int size;
    int channel;
    String color;

    public TV(int size, int channel, String color){  //인스턴스 초기화 생성자
        this.size = size;                            //this -> TV인스턴스를 가리킴
        this.channel = channel;
        this.color = color;
    }
    public void channelUp(){                          //chnnel을 1씩 올려주는 메서드
        channel += 1;
    }

}

/* 실행시
1. Main, TV클래스 메모리에 로드
2. Main의 main 메서드 실행
3. TV인스턴스 힙영역에 생성 및 로드
4. TV의 메서드 스택에 실행
 */

