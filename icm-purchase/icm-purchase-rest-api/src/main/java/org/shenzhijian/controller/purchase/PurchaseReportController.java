package org.shenzhijian.controller.purchase;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.shenzhijian.persistence.purchase.entity.PurchaseReport;
import org.shenzhijian.service.purchase.PurchaseReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;


@Api(tags = {"采购申请管理"})
@RestController
@RequestMapping("/api/icm-purchase/reports")
@Validated
public class PurchaseReportController {

    private PurchaseReportService purchaseReportService;

    @Autowired
    public PurchaseReportController(PurchaseReportService purchaseReportService) {
        this.purchaseReportService = purchaseReportService;
    }

    //    @ApiOperation(value = "分页查询采购申请信息")
//    @GetMapping(value = "")
//    public PageDataDTO<PurchaseReport> findOnePage(
//            @ApiParam(value = "页号，从0开始", required = true, defaultValue = "0") @RequestParam("page") @Min(0) int page,
//            @ApiParam(value = "每页纪录条数", required = true, defaultValue = "20") @RequestParam("size") @Min(1) @Max(100) int size,
//            @ApiParam(value = "排序字段, 例如：字段1,asc,字段2,desc") @RequestParam(value = "sort", required = false, defaultValue = "id,desc") String sort,
//            @ApiParam(value = "状态类型,查询类型", required = true) @RequestParam(value = "stateType", required = false, defaultValue = "ALL") StateType stateType,
//            @ApiParam(value = "申请部门ID") @RequestParam(value = "departmentId", required = false) String departmentId,
//            @ApiParam(value = "申请人姓名，支持模糊查询") @RequestParam(value = "declarerName", required = false) String declarerName,
//            @ApiParam(value = "业务标题,支持模糊查询") @RequestParam(value = "title", required = false) String title,
//            @ApiParam(value = "申请单位ID") @RequestParam(value = "unitId", required = false) String unitId,
//            @ApiParam(value = "采购申请起始日期，区间查询", example = "2019-10-15") @RequestParam(value = "beginDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date beginDate,
//            @ApiParam(value = "采购申请结束日期，区间查询", example = "2019-10-15") @RequestParam(value = "endDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate,
//            @ApiParam(value = "采购类型：耗材/品目") @RequestParam(value = "purchaseType", required = false, defaultValue = "ALL") PurchaseType purchaseType,
//            @ApiParam(value = "支出类型") @RequestParam(value = "budgetApprovalType", required = false, defaultValue = "ALL") BudgetApprovalType budgetApprovalType,
//            @ApiParam(value = "采购单号") @RequestParam(value = "code", required = false) String code,
//            @ApiParam(value = "最小采购金额") @RequestParam(value = "beginAmount", required = false) Double beginAmount,
//            @ApiParam(value = "最大采购金额") @RequestParam(value = "endAmount", required = false) Double endAmount
//
//    ) {
//        return purchaseReportService.findOnePage(page, size, sort, stateType, departmentId, declarerName, title, purchaseType, budgetApprovalType, unitId, beginDate, endDate, beginAmount, endAmount, code);
//    }

    @ApiOperation(value = "查询当前操作可获取的采购申请")
    @GetMapping(value = "/all/done")
    public List<PurchaseReport> findAllDone(
            @ApiParam(value = "采购申请id()") @RequestParam(value = "id", required = false) String id,
            @ApiParam(value = "部门id()") @RequestParam(value = "departmentId", required = false) String departmentId
    ) {
        return null;
    }

    @ApiOperation(value = "通过采购状态、采购类型查询采购申请")
    @GetMapping(value = "/all")
    public List<PurchaseReport> findAll(
    ) {
        return purchaseReportService.findAll();
    }

    @ApiOperation(value = "查询可用余额大于0的采购申请")
    @GetMapping(value = "/available")
    public List<PurchaseReport> findAvailable(
            @ApiParam(value = "部门id()", required = true) @RequestParam(value = "departmentId") String departmentId,
            @ApiParam(value = "采购id") @RequestParam(value = "id", required = false) String id

    ) {
        return purchaseReportService.findAvailable(departmentId, id);
    }

    @ApiOperation(value = "根据ID查询采购申请")
    @GetMapping(value = "/{id}")
    public PurchaseReport findById(
            @ApiParam(value = "采购申请Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "任务Id") @RequestParam(value = "taskId", required = false) String taskId,
            @ApiParam(value = "是否过滤已验收内容") @RequestParam(value = "isFilter", required = false, defaultValue = "false") boolean isFilter
    ) {
        return purchaseReportService.findById(id, taskId, isFilter);
    }

    @ApiOperation(value = "招标登记时使用：根据ID查询采购申请(过滤掉已经进行招标登记过的采购品目)")
    @GetMapping(value = "/id")
    public PurchaseReport findCategoriesById(
            @ApiParam(value = "采购申请Id", required = true) @RequestParam(value = "id") String id,
            @ApiParam(value = "招标Id") @RequestParam(value = "bidId", required = false) String bidId
    ) {
        return purchaseReportService.findCategoriesById(id, bidId, false);
    }

    @ApiOperation(value = "采购验收时使用：根据ID查询采购申请(过滤掉已经进行验收登记过的采购内容)")
    @PutMapping(value = "/id")
    public PurchaseReport findPurchaseContentById(
            @ApiParam(value = "采购申请Id", required = true) @RequestParam(value = "id") String id,
            @ApiParam(value = "验收Id") @RequestParam(value = "acceptanceId", required = false) String acceptanceId
    ) {
        return purchaseReportService.findPurchaseContentById(id, acceptanceId);
    }

    @ApiOperation(value = "新建采购申请")
    @PostMapping(value = "")
    public PurchaseReport create(
            @ApiParam(value = "采购申请创建信息", required = true) @RequestBody @Validated PurchaseReport createInfo
    ) throws IOException {
        return purchaseReportService.create(createInfo);
    }

    @ApiOperation(value = "提交采购申请")
    @PutMapping(value = "/{id}")
    public PurchaseReport complete(
            @ApiParam(value = "采购申请Id", required = true) @PathVariable(name = "id") String id,
            @ApiParam(value = "采购申请编辑信息", required = true) @RequestBody @Validated PurchaseReport editInfo
    ) throws IOException {
        return purchaseReportService.complete(id, editInfo);
    }

    @ApiOperation(value = "删除采购申请")
    @DeleteMapping(value = "/{id}")
    public void delete(
            @ApiParam(value = "支出预算Id", required = true) @PathVariable(name = "id") String id
    ) {
        purchaseReportService.delete(id);
    }

    @ApiOperation(value = "获取采购品目中所用的指标库的可用余额")
    @GetMapping(value = "/index")
    public Map<String, Double> getIndex(
            @ApiParam(value = "当前指标id集合", required = true) @RequestParam(name = "ids") List<String> ids,
            @ApiParam(value = "采购申请ID") @RequestParam(name = "id", required = false) String id
    ) {
        return purchaseReportService.getIndex(id, ids);
    }
}

