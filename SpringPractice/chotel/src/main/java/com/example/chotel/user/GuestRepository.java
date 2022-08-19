// 투숙객의 정보를 담기 위한 저장소 객체

package com.example.chotel.user;

public interface GuestRepository {

    void saveGuest(Guest guest); // 투숙객 - Guest객체를 저장하는 추상메서드
    Guest findByGuestId(Long guestId); // 투숙객 id로 Guest객체 반환하는 추상메서드
}
