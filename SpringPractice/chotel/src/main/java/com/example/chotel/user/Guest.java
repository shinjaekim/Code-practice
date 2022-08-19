//투숙객 객체(정보로 표현한 투숙객 객체 - 관리를 위해)

package com.example.chotel.user;

public class Guest {
    private Long id;
    private String name;
    private GuestGrade guestGrade;

    public Guest(Long id, String name, GuestGrade guestGrade){
        this.id = id;
        this.name = name;
        this.guestGrade = guestGrade;
    }

    // command n -> getter setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestGrade getGuestGrade() {
        return guestGrade;
    }

    public void setGuestGrade(GuestGrade guestGrade) {
        this.guestGrade = guestGrade;
    }
}
