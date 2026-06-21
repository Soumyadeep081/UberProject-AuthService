package org.example.uberprojectauthservice.dtos;

import lombok.*;
import org.example.uberprojectentityservice.models.Passenger;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private Long id;
    private String name;
    private String email;
    private String password; // encrypted password
    private String phoneNumber;
    private Date createdAt;

    public static PassengerDto from(Passenger p){
        PassengerDto result=PassengerDto.builder()
                            .id(p.getId())
                            .createdAt(p.getCreatedAt())
                            .email(p.getEmail())
                            .name(p.getName())
                            .password(p.getPassword())
                            .phoneNumber(p.getPhoneNumber())
                            .build();
        return result;
    }
}
