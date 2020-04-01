package org.shenzhijian.controller.budget;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.shenzhijian.service.budget.BudgetApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"预算批复管理"})
@RestController
@RequestMapping("/api/icm-budget/approval")
@Validated
public class BudgetApprovalController {

    private static final String DATA_TYPE = "预算批复管理";

    private BudgetApprovalService budgetApprovalService;

    @Autowired
    public BudgetApprovalController(BudgetApprovalService budgetApprovalService) {
        this.budgetApprovalService = budgetApprovalService;
    }

//    @ApiOperation(value = "分页查询基本支出预算批复信息")
//    @GetMapping(value = "/basics")
//    public PageDataDTO<ProjectBudget> findBasicApprovalsOnePage(
//            @ApiParam(value = "页号，从0开始", required = true, defaultValue = "0") @RequestParam("page") @Min(0) int page,
//            @ApiParam(value = "每页纪录条数", required = true, defaultValue = "20") @RequestParam("size") @Min(1) @Max(100) int size,
//            @ApiParam(value = "排序字段, 例如：字段1,asc,字段2,desc") @RequestParam(value = "sort", required = false, defaultValue = "id,desc") String sort,
//            @ApiParam(value = "项目名称") @RequestParam(value = "projectName", required = false) String projectName,
//            @ApiParam(value = "单位性质") @RequestParam(value = "unitCharacter", required = false) String unitCharacter,
//            @ApiParam(value = "项目类别") @RequestParam(value = "projectType", required = false) String projectType
//    ) {
//        return budgetApprovalService.findBasicApprovalsOnePage(page, size, sort, projectName, projectType, unitCharacter);
//    }

//    @ApiOperation(value = "分页查询项目支出预算批复信息")
//    @GetMapping(value = "/projects")
//    public PageDataDTO<ProjectBudget> findProjectApprovalsOnePage(
//            @ApiParam(value = "页号，从0开始", required = true, defaultValue = "0") @RequestParam("page") @Min(0) int page,
//            @ApiParam(value = "每页纪录条数", required = true, defaultValue = "20") @RequestParam("size") @Min(1) @Max(100) int size,
//            @ApiParam(value = "排序字段, 例如：字段1,asc,字段2,desc") @RequestParam(value = "sort", required = false, defaultValue = "id,desc") String sort,
//            @ApiParam(value = "项目编码") @RequestParam(value = "code", required = false) String code,
//            @ApiParam(value = "项目名称") @RequestParam(value = "projectName", required = false) String projectName,
//            @ApiParam(value = "项目类别") @RequestParam(value = "projectType", required = false) String projectType,
//            @ApiParam(value = "项目类别明细,对于字典表类型: PROJECT_DETAILED_TYPE") @RequestParam(value = "detailedProjectType", required = false) String detailedProjectType
//    ) {
//        return budgetApprovalService.findProjectApprovalsOnePage(page, size, sort, code, projectName, projectType, detailedProjectType);
//    }

    @ApiOperation(value = "根据ID查询基本支出预算批复信息")
    @GetMapping(value = "/basic/{id}")
    public ProjectBudget findBasicApprovalById(
            @ApiParam(value = "预算批复Id", required = true) @PathVariable(name = "id") String id
    ) {
        return budgetApprovalService.findBasicApprovalById(id);
    }

    @ApiOperation(value = "根据ID查询项目支出预算批复信息")
    @GetMapping(value = "/project/{id}")
    public ProjectBudget findProjectApprovalById(
            @ApiParam(value = "预算批复Id", required = true) @PathVariable(name = "id") String id
    ) {
        return budgetApprovalService.findProjectApprovalById(id);
    }

    @ApiOperation(value = "新建项目支出预算批复")
    @PostMapping(value = "/project")
    public ProjectBudget createProjectApproval(
            @ApiParam(value = "项目支出预算批复编辑信息", required = true) @RequestBody @Validated ProjectBudget projectBudgetCreateInfoDTO
    ) {
        return budgetApprovalService.createProjectApproval(projectBudgetCreateInfoDTO);
    }

    @ApiOperation(value = "新建基本支出预算批复")
    @PostMapping(value = "/basic")
    public ProjectBudget createBaseApproval(
            @ApiParam(value = "基本支出预算批复编辑信息", required = true) @RequestBody @Validated ProjectBudget basicBudgetCreateInfoDTO
    ) {
        return budgetApprovalService.createBasicApproval(basicBudgetCreateInfoDTO);
    }

    @ApiOperation(value = "修改基本支出预算批复")
    @PutMapping(value = "/basic/{id}")
    public ProjectBudget saveBaseApproval(
            @ApiParam(value = "预算批复Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "基本支出预算批复编辑信息", required = true) @RequestBody @Validated ProjectBudget basicBudgetEditInfoDTO
    ) {
        return budgetApprovalService.saveBasicApproval(id, basicBudgetEditInfoDTO);
    }

    @ApiOperation(value = "修改项目支出预算批复")
    @PutMapping(value = "/project/{id}")
    public ProjectBudget saveProjectApproval(
            @ApiParam(value = "预算批复Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "项目支出预算批复编辑信息", required = true) @RequestBody @Validated ProjectBudget projectBudgetEditInfoDTO
    ) {
        return budgetApprovalService.saveProjectApproval(id, projectBudgetEditInfoDTO);
    }

    @ApiOperation(value = "删除预算批复")
    @DeleteMapping(value = "/{id}")
    public void delete(
            @ApiParam(value = "预算批复Id", required = true) @PathVariable(name = "id") String id
    ) {
        budgetApprovalService.delete(id);
    }

    @ApiOperation(value = "确认项目预算")
    @PutMapping(value = "/confirmation")
    public void confirmation(
            @ApiParam(value = "基本支出预算批复编辑信息", required = true) @RequestBody @Validated List<String> ids
    ) {
        budgetApprovalService.confirmation(ids);
    }

    @ApiOperation(value = "根据项目编码查询预算明细")
    @GetMapping(value = "/detail")
    public List<ProjectBudget> findByCode(
            @ApiParam(value = "项目编码") @RequestParam(value = "projectCode") String projectCode
    ) {
        return budgetApprovalService.findByCode(projectCode);
    }
}
