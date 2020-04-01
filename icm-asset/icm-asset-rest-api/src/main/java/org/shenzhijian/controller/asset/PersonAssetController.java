package org.shenzhijian.controller.asset;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"个人资产"})
@RestController
@RequestMapping("/api/icm-asset/personAsset")
public class PersonAssetController {

    @DeleteMapping(value = "")
    public void search() {
    }

}
