package com.example.demo.payload.request;

import com.example.demo.model.User;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    private Long id;
    private String name;
    private Long age;
    private String city;
    public User createEntity(){
        return User.builder()
                .name(this.name)
                .age(this.age)
                .city(this.city)
                .build();
    }

    public User updateEntity(){
        return User.builder()
                .id(this.id)
                .name(this.name)
                .age(this.age)
                .city(this.city)
                .build();
    }

}
