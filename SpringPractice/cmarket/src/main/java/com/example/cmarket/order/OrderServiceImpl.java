package com.example.cmarket.order;

import com.example.cmarket.discount.DiscountInfo;
//import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserRepository;
// import com.example.cmarket.user.UserRepositoryImpl;

public class OrderServiceImpl implements OrderService {

    //private final UserRepository userRepository = new UserRepositoryImpl(); //수정2 구현클래스 ㄴㄴ
    //private final DiscountInfo discountInfo = new CurrentDiscountInfo();  //수정2 구현클래스 ㄴㄴ

    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo){
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String itemName, int itemPrice) {
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }
}