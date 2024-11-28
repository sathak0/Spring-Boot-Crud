package com.example.demo.payload.response;

import com.example.demo.model.User;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String name;
    private Long age;
    private String city;
    public static  UserResponse createDTO(User user){
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .age(user.getAge())
                .city(user.getCity())
                .build();
    }

    public static List<UserResponse> createDTOList(List<User> userList){
        return userList.stream().map(UserResponse::createDTO).collect(Collectors.toList());
    }

}
