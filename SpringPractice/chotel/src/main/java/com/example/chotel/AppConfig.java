package com.example.chotel;

import com.example.chotel.checkIn.CheckInService;
import com.example.chotel.checkIn.CheckInServiceImpli;
import com.example.chotel.discount.CurrentDiscountInfo;
import com.example.chotel.user.GuestServiceImpli;
import com.example.chotel.user.GuestService;
import com.example.chotel.user.GuestRepositoryImpl;

public class AppConfig {
    public GuestService guestService() {
        return new GuestServiceImpli(new GuestRepositoryImpl());
    }

    public CheckInService checkInService(){
        return new CheckInServiceImpli()(new GuestRepositoryImpl(), new CurrentDiscountInfo());
    }
}
