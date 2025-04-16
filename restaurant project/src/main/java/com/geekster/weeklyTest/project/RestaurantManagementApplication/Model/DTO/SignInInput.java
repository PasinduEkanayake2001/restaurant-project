package com.geekster.weeklyTest.project.RestaurantManagementApplication.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInInput {
    private String email;
    private String Password;
}

