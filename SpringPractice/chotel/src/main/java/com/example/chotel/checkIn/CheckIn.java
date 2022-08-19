package com.example.chotel.checkIn;

public class CheckIn {

    private Long guestId;
    private String roomName;
    private int roomPrice;
    private int discountPrice;

    public CheckIn(Long guestId, String roomName, int roomPrice, int discountPrice){
        this.guestId = guestId;
        this.roomName = roomName;
        this.roomPrice = roomPrice;
        this.discountPrice = discountPrice;
    }

    public int discountedPrices(){
        return roomPrice - discountPrice;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }
}
