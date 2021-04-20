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
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.restfulproject.CategoryRepository;
@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository repositor;
    public List<Category> kisilistesi()
    {
            return repositor.findAll();
    }
    public void kisiKaydet(Category kisiler)
    {
        repositor.save(kisiler);
    }
    public Category getKisi(int Id)
    {
        return repositor.findById(Id).get();
    }
    public void kisiSil(int Id)
    {
        repositor.deleteById(Id);
    }
    public int sayacim(int Id)
    {
        return repositor.sayacta(Id);
    }
  
}
