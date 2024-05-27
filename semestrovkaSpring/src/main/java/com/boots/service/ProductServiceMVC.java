package com.boots.service;

import com.boots.entity.Category;

import java.util.List;

public interface ProductServiceMVC {


    List<Category> getAllProducts();

    void saveProduct(Category category);

    Category getProductById(Long id);

    void deleteProductById(Long id);

   // Page<Product> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection);
}
