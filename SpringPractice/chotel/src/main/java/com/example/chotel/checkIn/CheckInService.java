package com.example.chotel.checkIn;

public interface CheckInService {

    CheckIn assignRoom(Long guestId, String roomName, int roomPrice);
}
