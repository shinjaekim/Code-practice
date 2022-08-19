//스프링 없는 컨테이너만 사용한 객체 방법 -> 각각의 공간에 객체가 생성 -> 메모리 비효율

package com.example.cmarket;

// import com.example.cmarket.user.UserService; // 1. 싱글톤 적용 안된다면
import com.example.cmarket.singleton.SingletonService; // 2.싱글톤 직접 만들어서 적용하면
import com.example.cmarket.user.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonApp {

    // static AppConfig appconfig = new AppConfig(); // 1.

    //static UserService userService1 = appconfig.userService(); // 1.
    //static UserService userService2 = appconfig.userService(); // 1.

    //static SingletonService singletonService1 = SingletonService.getInstance(); // 2.
    //static SingletonService singletonService2 = SingletonService.getInstance(); // 2.

    static AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);

    static UserService userService1 = ac.getBean("userService", UserService.class);
    static UserService userService2 = ac.getBean("userService", UserService.class);

    public static void main(String[] args) {
        //System.out.println("userService 1 : " + userService1); // 1.
        //System.out.println("userService 1 : " + userService2); // 1.
        //System.out.println("singletonService1 : " + singletonService1); // 2.
        //System.out.println("singletonService2 : " + singletonService2); // 2.
        System.out.println("userService 1 : " + userService1);
        System.out.println("userService 2 : " + userService2);
    }
}

