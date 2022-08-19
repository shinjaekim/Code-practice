package com.codestates.member;


// import org.springframework.http.MediaType; // 버전 1
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;

@RestController
//@RequestMapping(value = "/v1/members" , produces = {MediaType.APPLICATION_JSON_VALUE}) // 버전 1
@RequestMapping("v1/members")
public class MemberController {
    @PostMapping
    public String PostMember(@RequestParam String email,
                             @RequestParam String name,
                             @RequestParam String phone){
        System.out.println("# email: " + email);
        System.out.println("# name: " + name);
        System.out.println("# phone : " + phone);

        /*String response =
                "{\"" +
                        "email\":\""+email+"\"," +
                        "\"name\":\""+name+"\",\"" +
                        "phone\":\"" + phone+
                        "\"}";
        return response;  //버전 1
        */
        Map<String, String> map = new HashMap<>();
        map.put("email", email);
        map.put("name", name);
        map.put("phone", phone);

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/{member-id}")
    public String getMember(@PathVariable("member-id")long memberId){
        System.out.println("# memberId: " + memberId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public String getMembers(){
        System.out.println("# get Members");

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
