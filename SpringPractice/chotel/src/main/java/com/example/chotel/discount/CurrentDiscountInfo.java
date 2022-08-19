// 할인 관련 객체

package com.example.chotel.discount;

import com.example.chotel.user.Guest;
import com.example.chotel.user.GuestGrade;

public class CurrentDiscountInfo implements DiscountInfo {

    private int grade_1_Amount = 500;
    private int grade_2_Amount = 1000;

    @Override
    public int discount(Guest guest, int price){
        if(guest.getGuestGrade() == GuestGrade.GRADE_1) { // enum 타입 비교는 ==
            return grade_1_Amount;
        }
        else if(guest.getGuestGrade() == GuestGrade.GRADE_2){
            return grade_2_Amount;
        }
        return 0;
    }
}
