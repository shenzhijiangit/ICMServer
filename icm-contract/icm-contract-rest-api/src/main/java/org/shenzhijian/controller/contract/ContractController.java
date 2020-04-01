package org.shenzhijian.controller.contract;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"合同模块"})
@RestController
@RequestMapping("/api/icm-contract/contracts")
public class ContractController {

    @DeleteMapping(value = "")
    public void search() {
    }


}
