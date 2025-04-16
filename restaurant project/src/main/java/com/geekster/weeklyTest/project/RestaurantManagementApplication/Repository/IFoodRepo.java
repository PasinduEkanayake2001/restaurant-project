package com.geekster.weeklyTest.project.RestaurantManagementApplication.Repository;

import com.geekster.weeklyTest.project.RestaurantManagementApplication.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<Food,Integer> {

}

