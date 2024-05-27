package com.boots.service;

import com.boots.repository.ExpenditureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final ExpenditureRepository expenditureRepository;

    @Override
    public List<Expenditure> getAllExpenditure() {
        return expenditureRepository.findAll();
    }

    @Override
    public Expenditure getExpenditureById(Long id) {
        Optional<Expenditure> optionalExpenditure = expenditureRepository.findById(id);
        Expenditure expenditure = null;
        if(optionalExpenditure.isPresent()){
            expenditure = optionalExpenditure.get();
        }else {
            throw new RuntimeException("Expnditure is not found for id" + id);
        }
        return expenditure;
    }
}
