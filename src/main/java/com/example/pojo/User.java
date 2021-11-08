package com.example.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class User {
    private String name,age;
    private List<String> girls;
}
