
package com.morozov.projects.bookstore_xsoft_task.service.impl;


import com.morozov.projects.bookstore_xsoft_task.dto.UserDto;
import com.morozov.projects.bookstore_xsoft_task.model.Role;
import com.morozov.projects.bookstore_xsoft_task.model.User;
import com.morozov.projects.bookstore_xsoft_task.repository.RoleRepository;
import com.morozov.projects.bookstore_xsoft_task.repository.UserRepository;
import com.morozov.projects.bookstore_xsoft_task.service.UserService;
import com.morozov.projects.bookstore_xsoft_task.util.TbConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        Role role = roleRepository.findByName(TbConstants.Roles.READER);

        if (role == null)
            role = roleRepository.save(new Role(TbConstants.Roles.READER));

        User user = new User(userDto.getName(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
                Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }
}
