package com.project.account_service.Model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transactions")
public class Transactions {

    @Id
    private String id;

    @DBRef
    private Account account;

    private TransactionType transactionType;

    private Double amount;

    private LocalDateTime timestamp = LocalDateTime.now();
}
