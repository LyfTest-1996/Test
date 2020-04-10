package com.example.lyf.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.example.lyf.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
