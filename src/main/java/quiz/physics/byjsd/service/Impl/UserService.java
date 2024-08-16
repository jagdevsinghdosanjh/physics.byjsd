package quiz.physics.byjsd.service.Impl;

import java.util.List;

import quiz.physics.byjsd.dto.UserDto;
import quiz.physics.byjsd.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}