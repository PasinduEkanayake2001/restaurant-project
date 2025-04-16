package com.geekster.weeklyTest.project.RestaurantManagementApplication.Repository;


import com.geekster.weeklyTest.project.RestaurantManagementApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String newEmail);
}

