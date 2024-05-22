package com.lloyds.azure.lloydsazure.paymentServices;


import com.lloyds.azure.lloydsazure.paymentRepository.PaymentRepo;
import com.lloyds.azure.lloydsazure.paymentsModel.Payments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class PaymentConsumer {

    private final Logger logger = LoggerFactory.getLogger(PaymentConsumer.class);

    @Autowired
    private PaymentRepo paymentRepo;


    @KafkaListener(topics = "payments", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("$$$ -> Consumed Message -> %s", message));
    }

    public Payments saveEmployee(Payments employee) {
        Payments savedEmployee = paymentRepo.save(employee);
        logger.info("Employee with id: {} saved successfully", employee.getId());
        return savedEmployee;
    }
}
