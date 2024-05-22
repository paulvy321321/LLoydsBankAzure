package com.lloyds.azure.lloydsazure.paymentRepository;


import com.lloyds.azure.lloydsazure.paymentsModel.Payments;
import org.springframework.data.repository.CrudRepository;


//@EnableJpaRepositories
public interface PaymentRepo extends CrudRepository<Payments, Integer> {
}
