package com.lloyds.azure.lloydsazure.paymentServices;


import com.lloyds.azure.lloydsazure.Exception.GenericErrors;
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

    @KafkaListener(topics = "jsonpayments", groupId = "group_id")
    public void jsonConsume(Payments payments) {

        logger.info(String.format("User created -> %s", payments.getAmount()));
    }

    public String saveTransactionDetails(Payments transactions) throws GenericErrors {
        try {
            paymentRepo.save(transactions);
            logger.info("Payment Transactions: {} saved successfully", transactions.getId());
        } catch (Exception e) {
            logger.error("Unable to save the transactions due to :", e.getMessage());
            throw new GenericErrors(e.getMessage());
        }
        return "transactions saved successfully";
    }
}

