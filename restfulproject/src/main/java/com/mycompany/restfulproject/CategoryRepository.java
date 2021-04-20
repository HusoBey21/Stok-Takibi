/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulproject;

/**
 *
 * @author huseyin
 */
import com.mycompany.restfulproject.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CategoryRepository extends JpaRepository<Category,Integer> {

   @Query("select count(c) from Category c where c.Id=?1")
    int sayacta(@Param("id") int user_id);
    
    
    
}
