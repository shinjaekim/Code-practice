//투숙객의 저장소 인터페이스를 실제 사용하는 서비스

package com.example.chotel.user;

public interface GuestService {

    void signUp(Guest guest);   // 투숙객의 회원가입
    Guest findGuest(Long guestId);  // 투숙객의 정보를 찾는 것
}
