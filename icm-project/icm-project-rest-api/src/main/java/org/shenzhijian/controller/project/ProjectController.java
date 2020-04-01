package org.shenzhijian.controller.project;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"项目模块"})
@RestController
@RequestMapping("/api/icm-project/project")
public class ProjectController {

    @DeleteMapping(value = "")
    public void search() {
    }

}
