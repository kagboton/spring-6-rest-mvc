package com.kagboton.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Customer {
    private String customerName;
    private String id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
