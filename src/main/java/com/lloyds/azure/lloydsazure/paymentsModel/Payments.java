package com.lloyds.azure.lloydsazure.paymentsModel;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import jakarta.persistence.Entity;

@Entity
@Data
@Table(name = "transactions")
public class Payments {
    @Id
    Integer id;
    String amount;
    String modeoftransaction;
}
