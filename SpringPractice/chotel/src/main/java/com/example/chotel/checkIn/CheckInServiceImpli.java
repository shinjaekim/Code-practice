package com.example.chotel.checkIn;

//import com.example.chotel.discount.CurrentDiscountInfo;
import com.example.chotel.discount.DiscountInfo;
//import com.example.chotel.discount.RateDiscountInfo;
import com.example.chotel.user.Guest;
import com.example.chotel.user.GuestRepository;
import com.example.chotel.user.GuestServiceImpli;
//import com.example.chotel.user.GuestRepositoryImpl;

public class CheckInServiceImpli implements CheckInService {

    //private final GuestRepository guestRepository = new GuestRepositoryImpl();
    //private final DiscountInfo discountInfo = new CurrentDiscountInfo();
    //private final DiscountInfo discountInfo = new RateDiscountInfo();

    private final GuestRepository guestRepository;
    private final DiscountInfo discountInfo;

    public GuestServiceImpli(GuestRepository guestRepository, DiscountInfo discountInfo){
        this.guestRepository = guestRepository;
        this. discountInfo = discountInfo;
    }

    @Override
    public CheckIn assignRoom(Long guestId, String roomName, int roomPrice){
        Guest guest = guestRepository.findByGuestId(guestId);
        int discountPrice = discountInfo.discount(guest, roomPrice);

        return new CheckIn(guestId, roomName, roomPrice, discountPrice);
    }
}
