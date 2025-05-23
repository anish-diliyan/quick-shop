package com.example.quick_shop.service.user;

import com.example.quick_shop.dto.UserDto;
import com.example.quick_shop.model.User;
import com.example.quick_shop.request.CreateUserRequest;
import com.example.quick_shop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
