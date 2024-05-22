package com.lloyds.azure.lloydsazure.paymentsModel;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "transactions")
public class Payments {
    @Id
    Integer id;
    String amount;
    String modeoftransaction;
}
