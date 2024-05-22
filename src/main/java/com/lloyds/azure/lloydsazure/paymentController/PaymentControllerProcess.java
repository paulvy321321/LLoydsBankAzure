package com.lloyds.azure.lloydsazure.paymentController;

import com.lloyds.azure.lloydsazure.paymentServices.PaymentConsumer;
import com.lloyds.azure.lloydsazure.paymentsModel.Payments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentControllerProcess {
    @Autowired
    private PaymentConsumer paymentConsumer;


    @RequestMapping(value = "/process", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<Payments> inputPayments(@RequestBody Payments paymentsInput){
        return ResponseEntity.ok().body(paymentConsumer.saveEmployee(paymentsInput));
    }
}