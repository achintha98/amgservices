package com.amgcode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckRepository fraudCheckRepository;

    public Boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckRepository.save(FraudCheckHistory.builder().
                customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());
        return false;
    }
}
