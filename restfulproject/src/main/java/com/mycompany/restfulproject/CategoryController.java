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
import com.mycompany.restfulproject.CategoryService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/category")

public class CategoryController {
    @Autowired
    CategoryService hizmet;
   @GetMapping("")
   public List<Category> kisilistesi()
   {
       return hizmet.kisilistesi();
   }
   @GetMapping("/{id}")
   public ResponseEntity<Category> get(@PathVariable int id)
   {
       try
       {
           Category kisiler=hizmet.getKisi(id);
           return new ResponseEntity<Category>(kisiler,HttpStatus.OK);
       }
       catch(NoSuchElementException ex)
       {
           return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
       }
       
   }
  
   @PostMapping("/")
   public void ekle(@RequestBody Category kisiler)
   {
       hizmet.kisiKaydet(kisiler);
   }
   @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category kisiler,@PathVariable int id)
    {
        try
        {
            Category varolankisi=hizmet.getKisi(id);
            kisiler.setID(id);
            hizmet.kisiKaydet(kisiler);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(NoSuchElementException e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/[id}")
    public void deleteCategory(@PathVariable int id)
    {
        hizmet.kisiSil(id);
    }
    @RequestMapping("/counts/{id}")
     public int sayac(@PathVariable int id)
    {
        int sayaclar=hizmet.sayacim(id);
        return sayaclar;
    }    

}
