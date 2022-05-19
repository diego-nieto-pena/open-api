package io.api.first.service;
import io.api.first.apispec.UsersApiDelegate;
import io.api.first.model.UserDTO;
import io.api.first.model.UserStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersApiDelegateImpl implements UsersApiDelegate {

    @Override
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> users = new ArrayList<>();
        final UserDTO user1 = new UserDTO();
        user1.setName("Diego");
        user1.setLastname("Nieto");
        user1.setDocument(1020719180L);
        users.add(user1);

        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
