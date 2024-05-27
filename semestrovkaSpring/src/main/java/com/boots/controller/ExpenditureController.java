package com.boots.controller;

import com.boots.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ExpenditureController {

    private final TransactionService transactionService;

    @RequestMapping("/allExpenditure")
    public String list(ModelMap map) {
        System.out.println("list");
        map.put("expenditure", transactionService.getAllExpenditure());
        return "products/expenditure";
    }
}
