package com.example.chotel.discount;

import com.example.chotel.user.Guest;
import com.example.chotel.user.GuestGrade;

public class RateDiscountInfo implements DiscountInfo {

    private int grade_1_Rate = 5;
    private int grade_2_Rate = 10;
    @Override
    public int discount(Guest user, int price) {
        if(user.getGuestGrade() == GuestGrade.GRADE_1) {
            return price * grade_1_Rate / 100;
        } else if(user.getGuestGrade() == GuestGrade.GRADE_2) {
            return price * grade_2_Rate / 100;
        }
        return 0;
    }
}

