package com.example.demo.parames;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberVo implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String password;
    private int rank;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRank() {
        return rank;
    }
}
