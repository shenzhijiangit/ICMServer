package org.shenzhijian.controller.project;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.shenzhijian.persistence.project.entity.GeneralProject;
import org.shenzhijian.service.project.GeneralProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@Api(tags = {"项目库管理"})
@RestController
@RequestMapping("/api/icm-project/general-projects")
public class GeneralProjectController {

    private static final String DATA_TYPE = "项目库";

    private final GeneralProjectService generalProjectService;

    @Autowired
    public GeneralProjectController(GeneralProjectService generalProjectService) {
        this.generalProjectService = generalProjectService;
    }

//    @ApiOperation(value = "分页查询项目库信息")
//    @GetMapping(value = "")
//    public PageDataDTO<GeneralProject> findOnePage(
//            @ApiParam(value = "页号，从0开始", required = true, defaultValue = "0") @RequestParam("page") @Min(0) int page,
//            @ApiParam(value = "每页纪录条数", required = true, defaultValue = "20") @RequestParam("size") @Min(1) @Max(100) int size,
//            @ApiParam(value = "排序字段, 例如：字段1,asc,字段2,desc") @RequestParam(value = "sort", required = false, defaultValue = "id,desc") String sort,
//            @ApiParam(value = "申报部门") @RequestParam(value = "departmentId", required = false) String departmentId,
//            @ApiParam(value = "项目名称") @RequestParam(value = "name", required = false) String name,
//            @ApiParam(value = "项目类别") @RequestParam(value = "projectType", required = false) String projectType,
//            @ApiParam(value = "项目类别明细") @RequestParam(value = "detailedProjectType", required = false) String detailedProjectType,
//            @ApiParam(value = "项目编号") @RequestParam(value = "code", required = false) String code,
//            @ApiParam(value = "申报年份") @RequestParam(value = "year", required = false) String year,
//            @ApiParam(value = "查询类型") @RequestParam(value = "stateType", required = false) StateType stateType,
//            @ApiParam(value = "业务步骤") @RequestParam(value = "step", required = false) BusinessStep step
//    ) throws IOException {
//        return generalProjectService.findOnePage(page, size, sort, departmentId, name, projectType, detailedProjectType, code, year, stateType, step);
//    }

    @ApiOperation(value = "根据ID查询项目库")
    @GetMapping(value = "{id}")
    public GeneralProject findById(
            @ApiParam(value = "项目Id", required = true) @PathVariable(name = "id") String id
    ) throws IOException {
        return generalProjectService.findById(id);
    }

    @ApiOperation(value = "新建项目库")
    @PostMapping(value = "")
    public GeneralProject create(
            @ApiParam(value = "项目库编辑信息", required = true) @RequestBody @Validated GeneralProject generalProjectCreateInfo
    ) throws IOException {
        return generalProjectService.create(generalProjectCreateInfo);
    }

    @ApiOperation(value = "提交项目库")
    @PutMapping(value = "/{id}")
    public GeneralProject complete(
            @ApiParam(value = "项目Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "项目库编辑信息", required = true) @RequestBody @Validated GeneralProject generalProjectEditInfo
    ) throws IOException {
        return generalProjectService.complete(id, generalProjectEditInfo);
    }

    @ApiOperation(value = "删除项目库")
    @DeleteMapping(value = "/{id}")
    public void delete(
            @ApiParam(value = "项目Id", required = true) @PathVariable(name = "id") String id
    ) throws IOException {
        generalProjectService.delete(id);
    }

    @ApiOperation(value = "汇总项目库,只有审结的项目才允许汇总")
    @PostMapping(value = "/collection")
    public GeneralProject collect(
            @ApiParam(value = "项目ID集合", required = true) @RequestBody @Validated List<String> ids
    ) throws IOException {
        return null;
    }

    @ApiOperation(value = "提交项目库至财局,只有审结的项目才允许提交")
    @PostMapping(value = "/submit-to-finance")
    public void submitToFinance(
            @ApiParam(value = "项目ID集合", required = true) @RequestBody @Validated List<String> ids
    ) {

    }

    @ApiOperation(value = "查询全部项目库信息")
    @GetMapping(value = "/all")
    public List<GeneralProject> findAll(
            @ApiParam(value = "申报单位") @RequestParam(value = "unitId", required = false) String unitId,
            @ApiParam(value = "申报部门") @RequestParam(value = "departmentId", required = false) String departmentId,
            @ApiParam(value = "项目名称") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "项目类别") @RequestParam(value = "projectType", required = false) String projectType,
            @ApiParam(value = "项目类别明细") @RequestParam(value = "detailedProjectType", required = false) String detailedProjectType,
            @ApiParam(value = "是否可计划") @RequestParam(value = "availablePlan", required = false) Boolean availablePlan
    ) throws IOException {
        return generalProjectService.findAll(unitId, departmentId, name, projectType, detailedProjectType, availablePlan);
    }
}
