package com.example.chotel.discount;

import com.example.chotel.user.Guest;

public interface DiscountInfo {

    int discount(Guest guest, int price);
}
