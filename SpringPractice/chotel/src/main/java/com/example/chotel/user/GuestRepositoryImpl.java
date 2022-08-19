//투숙객 저장소 인터페이스 구현

package com.example.chotel.user;

import java.util.HashMap;  // 해쉬맵을 이용하기위해 라이브러리 가져옴
import java.util.Map;      // 맵을 이용하기위해 라이브러리 가져옴

public class GuestRepositoryImpl implements GuestRepository {

    private static Map<Long, Guest> guests = new HashMap<>(); // 다형성. 맵으로 해쉬맵 인터페이스받음 (상위->하위)

    @Override
    public void saveGuest(Guest guest){      // 게스트 객체를 해쉬맵에 저장하는 메서드
        guests.put(guest.getId(), guest);
    }

    @Override
    public Guest findByGuestId(Long guestId){  // 게스트아이디로 객체 반환
        return guests.get(guestId);
    }
}
