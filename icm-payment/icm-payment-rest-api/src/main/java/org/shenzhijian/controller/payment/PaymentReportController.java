package org.shenzhijian.controller.payment;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"事前支出"})
@RestController
@RequestMapping("/api/icm-payment/paymentReport")
public class PaymentReportController {

    @DeleteMapping(value = "")
    public void search() {
    }

}
