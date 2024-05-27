package com.boots.controller;
import com.boots.controller.handlers.CustomException;
import com.boots.entity.Category;
import com.boots.service.util.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class CategoryController {

    @Autowired
    ProductService categoryService;

    @GetMapping(path = "/{id}")
    public Category getCategory(@PathVariable Long id){
        return categoryService.getCategory(id);
    }

    @GetMapping(path="/")
    public List<Category> getCategory(){
        return categoryService.getAllCategory();
    }

    @PostMapping(path="/")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.insertProduct(category);
    }

    @PutMapping(path="/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) throws CustomException {
        return categoryService.updateProduct(id, category);
    }


    @PostMapping("/deleteProduct")
    public String deleteCategory(@RequestParam("productId") Long productId) {
        categoryService.deleteProduct(productId);
        return "redirect:/http://localhost:8080/allProducts"; // перенаправьте пользователя на другую страницу после удаления
    }

}
