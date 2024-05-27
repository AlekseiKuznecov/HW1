package com.boots.service;

import java.util.List;

public interface WalletService {
//    @Autowired
//    ExpenditureRepository expenditureRepository;
//
//    public Expenditure getExpenditure(Long id){
//        return expenditureRepository
//                .findById(id)
//                .orElse(null);
//    }
//
//    public List<Expenditure> getAllExpendinture(){
//        List<Expenditure> expenditure =  StreamSupport.stream(expenditureRepository.findAll().spliterator(),false).collect(Collectors.toList());
//        return expenditure;
//    }

    List<Expenditure> getAllExpenditure();
    Expenditure getExpenditureById(Long id);

}
