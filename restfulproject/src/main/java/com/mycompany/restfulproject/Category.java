/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulproject;


import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author huseyin
 */


@Entity
@Table(name="category")
public class Category {
   
    
    
    @Column(name="user_id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="created_at")
    private int created;
    @Column(name="deletetable")
    private int deleted;
    
    public Category()
    {
        
    }
    public Category(String name,String description)
    {
        
        this.name=name;
        this.description=description;
        this.created=1;
        this.deleted=0;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public void setID(int id)
    {
        this.Id=id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setCreated(int created)
    {
        this.created=created;
    }
    public void setDeleted(int deleted)
    {
        this.deleted=deleted;
    }
    public int getCreated()
    {
        return this.created;
    }
    public int getDeleted()
    {
        return this.deleted;
    }
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getID()
    {
        return this.Id;
    }
    
   
    
  
    
   
}
