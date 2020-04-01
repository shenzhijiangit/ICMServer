package org.shenzhijian.controller.budget;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.shenzhijian.service.budget.ProjectBudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Api(tags = {"预算编制"})
@RestController
@RequestMapping("/api/icm-budget/projectBudget")
public class ProjectBudgetController {

    private static final String DATA_TYPE = "项目支出预算";

    private final ProjectBudgetService projectBudgetService;

    @Autowired
    public ProjectBudgetController(ProjectBudgetService projectBudgetService) {
        this.projectBudgetService = projectBudgetService;
    }

//    @ApiOperation(value = "分页查询项目支出预算信息")
//    @GetMapping(value = "")
//    public PageDataDTO<ProjectBudgetDTO> findOnePage(
//            @ApiParam(value = "页号，从0开始", required = true, defaultValue = "0") @RequestParam("page") @Min(0) int page,
//            @ApiParam(value = "每页纪录条数", required = true, defaultValue = "20") @RequestParam("size") @Min(1) @Max(100) int size,
//            @ApiParam(value = "排序字段, 例如：字段1,asc,字段2,desc") @RequestParam(value = "sort", required = false, defaultValue = "id,desc") String sort,
//            @ApiParam(value = "申报部门") @RequestParam(value = "departmentId", required = false) String departmentId,
//            @ApiParam(value = "项目名称") @RequestParam(value = "projectName", required = false) String projectName,
//            @ApiParam(value = "项目类别") @RequestParam(value = "projectType", required = false) String projectType,
//            @ApiParam(value = "项目类别明细") @RequestParam(value = "detailedProjectType", required = false) String detailedProjectType,
//            @ApiParam(value = "查询类型：全部/已审核/待审核", required = true) @RequestParam(value = "queryType") StateType stateType,
//            @ApiParam(value = "项目编码， 模糊查询") @RequestParam(value = "projectCode", required = false) String projectCode
//    ) {
//        return projectBudgetService.findOnePage(page, size, sort, departmentId, projectName, projectType, detailedProjectType, stateType, projectCode);
//    }

    @ApiOperation(value = "根据ID查询项目支出预算")
    @GetMapping(value = "{id}")
    public ProjectBudget findById(
            @ApiParam(value = "支出预算Id", required = true) @PathVariable(name = "id") String id
    ) throws IOException {
        return projectBudgetService.findById(id);
    }

    @ApiOperation(value = "新建项目支出预算")
    @PostMapping(value = "")
    public ProjectBudget create(
            @ApiParam(value = "项目支出预算编辑信息", required = true) @RequestBody @Validated ProjectBudget projectBudgetCreateInfo
    ) throws IOException {
        return projectBudgetService.create(projectBudgetCreateInfo);
    }

    @ApiOperation(value = "提交项目支出预算")
    @PutMapping(value = "/{id}")
    public ProjectBudget complete(
            @ApiParam(value = "支出预算Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "项目支出预算编辑信息", required = true) @RequestBody @Validated ProjectBudget projectBudgetEditInfo
    ) throws IOException {
        return projectBudgetService.complete(id, projectBudgetEditInfo);
    }

    @ApiOperation(value = "查询审批完未批复的编制")
    @GetMapping(value = "/all")
    public List<ProjectBudget> findAll(@ApiParam(value = "状态") @RequestParam(value = "state", required = false) String state) {
        return null;
    }

    @ApiOperation(value = "删除项目支出预算")
    @DeleteMapping(value = "/{id}")
    public void delete(
            @ApiParam(value = "支出预算Id", required = true) @PathVariable(name = "id") String id
    ) throws IOException {
        projectBudgetService.delete(id);
    }
}