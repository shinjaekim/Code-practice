package com.example.chotel.user;

public class GuestServiceImpli implements GuestService {

    // private final GuestRepository guestRepository = new GuestRepositoryImpl();
    private final GuestRepository guestRepository;

    public GuestServiceImpli(GuestRepository guestRepository){
        this.guestRepository = guestRepository;
    }

    @Override
    public void signUp(Guest guest) {
        guestRepository.saveGuest(guest);
    }

    @Override
    public Guest findGuest(Long guestId) {
        return guestRepository.findByGuestId(guestId);
    }
}
