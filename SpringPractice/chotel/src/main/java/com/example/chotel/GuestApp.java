package com.example.chotel;

import com.example.chotel.user.Guest;
import com.example.chotel.user.GuestGrade;
import com.example.chotel.user.GuestService;
import com.example.chotel.user.GuestServiceImpli;

public class GuestApp {

    public static void main(String[] args) {
        //GuestService guestService = new GuestServiceImpli();  // 서비스 실행하고
        AppConfig appConfig = new AppConfig();
        GuestService guestService = appConfig.guestService();
        Guest guest = new Guest(0L, "shinjeakim", GuestGrade.GRADE_2); // 내 객체를 만든다.
        guestService.signUp(guest);

        Guest currentGuest = guestService.findGuest(0L);
        System.out.println("새로운 투숙객 : " + guest.getName());
        System.out.println("현재 투숙객 : " + currentGuest.getName());

        if(guest.getName().equals(currentGuest.getName())){
            System.out.println("새로운 투숙객과 현재 투숙객이 같습니다.");
        }
    }
}
