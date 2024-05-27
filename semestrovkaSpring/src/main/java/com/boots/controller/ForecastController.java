package com.boots.controller;

import com.boots.controller.handlers.CustomException;
import com.boots.entity.util.Order;
import com.boots.service.util.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class ForecastController {

    @Autowired
    OrderService orderService;

    @GetMapping(path = "/{id}")
    public Order getForecast(@PathVariable Long id){
        return orderService.getOrder(id);
    }

    @GetMapping(path="/")
    public List<Order> getForecast(){
        return orderService.getAllOrders();
    }

    @GetMapping(path="/search")
    public List<Order> getSearchResultForecast(@RequestParam("startdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startDate,
                                               @RequestParam("enddate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endDate){
        return orderService.getSearchResultOrders(startDate,endDate);
    }

    @PostMapping(path="/")
    public Order saveForecast(@RequestBody Order order) throws CustomException {
        return orderService.insertOrder(order);
    }

    /*@PutMapping(path="/{id}")
    public Order updateOrder(@PathVariable Long id,@RequestBody Order order) throws CustomException {
        return orderService.updateOrder(id,order);
    }*/

    @DeleteMapping(path="/{id}")
    public void deleteForecast(@PathVariable Long id){
        orderService.deleteOrder(id);
    }

}