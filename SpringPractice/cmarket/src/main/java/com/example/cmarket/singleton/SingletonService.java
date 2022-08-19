package com.example.cmarket.singleton;

public class SingletonService {

    // static 영역에 객체를 딱 1개만 생성
    private static final SingletonService instance = new SingletonService();

    // 객체가 필요하면 아래 getInstance메서드를 통해서만 조회해라
    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new로 생성되는 것을 방지 - private
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체를 호출합니다.");
    }
}

/*
static 영역에 객체 인스턴스를 미리 1개 생성한다.

객체 인스턴스가 필요한 경우 getInstance() 메서드를 통해서만 조회한다.
    - 이 메서드를 호출하면 항상 같은 static instance를 호출하게 된다.

외부에서 생성자를 new로 새로 생성되는 것을 방지하기 위해 private 생성자로 생성합니다.

예시를 위한 것이지 스프링 컨테이너를 이용하면 직접 static 인스턴스를 만들 필요가 없음
    위처럼 직접 하면 문제가 생김

    코드 양 증가
    클라이언트가 구체 클래스에 의존 - concrete class (인터페이스가 아닌 모두 구현된 클래스에 의존한다)
    테스트의 어려움
    private생성자 -> 자식 클래스 만들기 어려움
    멀티 쓰레드에서의 값 변경 충돌 가능성 (그래서 읽을때만 쓴다)
    애플리케이션 구동시 생성되기 때문에 많을 수록 구동 시간 증가

하지만 싱클톤으로 하면
    스프링 컨테이너는 기본적으로 싱클톤
    위 단점 모두 해결
 */