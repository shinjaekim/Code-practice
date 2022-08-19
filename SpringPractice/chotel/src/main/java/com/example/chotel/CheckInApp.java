package com.example.chotel;

import com.example.chotel.discount.CurrentDiscountInfo;
import com.example.chotel.discount.RateDiscountInfo;
import com.example.chotel.user.Guest;
import com.example.chotel.user.GuestGrade;

public class CheckInApp {
    public static void main(String[] args) {

        //CurrentDiscountInfo discountInfo = new CurrentDiscountInfo();
        RateDiscountInfo discountInfo = new RateDiscountInfo();

        Guest guest = new Guest(0L, "shinjaekim", GuestGrade.GRADE_1);
        int discountedPrice = discountInfo.discount(guest, 50000);

        if(discountedPrice == 500){
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다. ");
            System.out.println("1등급 회원으로 5000 -> " + discountedPrice);
        }

        guest = new Guest(0L, "StoutKimsj", GuestGrade.GRADE_2);
        discountedPrice = discountInfo.discount(guest, 5000);

        if(discountedPrice == 1000){
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다. ");
            System.out.println("2등급 회원으로 5000 -> " + discountedPrice);
        }
    }
}
