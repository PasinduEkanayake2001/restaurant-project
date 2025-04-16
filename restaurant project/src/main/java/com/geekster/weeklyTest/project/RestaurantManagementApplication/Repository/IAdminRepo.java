package com.geekster.weeklyTest.project.RestaurantManagementApplication.Repository;


import com.geekster.weeklyTest.project.RestaurantManagementApplication.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Integer> {
    Admin findFirstByAdminEmail(String email);
}

