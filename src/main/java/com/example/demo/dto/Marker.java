package com.example.demo.dto;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Marker {
    String name;
    float latitude;
    float longtitude;

}
