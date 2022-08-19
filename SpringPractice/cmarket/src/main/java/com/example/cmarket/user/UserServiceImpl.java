package com.example.cmarket.user;

public class UserServiceImpl implements UserService{

   // private final UserRepository userRepository = new UserRepositoryImpl(); // 수정12 구현클래스 제거하고

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void signUp(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public User findUser(Long userId){
        return userRepository.findByUserId(userId);
    }
}
