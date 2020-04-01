package org.shenzhijian.service.purchase;


import org.shenzhijian.persistence.purchase.entity.PurchaseReport;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public interface PurchaseReportService {
    /**
     * 分页查询采购申请信息
     *
     * @param page               页号，从0开始
     * @param size               每页纪录条数
     * @param sort               排序字段, 例如：字段1,asc,字段2,desc
     * @param stateType          状态类型,查询类型
     * @param declarerName       申请部门ID
     * @param declarerId         申请人姓名
     * @param title              业务标题,支持模糊查询
     * @param purchaseType       采购类型
     * @param budgetApprovalType 支出类型
     * @param unitId             申请单位id
     * @param beginDate          开始时间
     * @param endDate            结束时间
     * @param beginAmount        最小采购金额
     * @param endAmount          最大采购金额
     * @param code               编码
     * @return 分页的采购申请详细信息
     */
    // PageDataDTO<PurchaseReportDTO> findOnePage(int page, int size, String sort, StateType stateType, String declarerName, String declarerId, String title, PurchaseType purchaseType, BudgetApprovalType budgetApprovalType, String unitId, Date beginDate, Date endDate, Double beginAmount, Double endAmount, String code);

    /**
     * 查询全部采购申请信息
     *
     * @param purchaseType 采购类型
     * @param purchaseState 采购状态
     * @param budgetApprovalType    支出类型
     * @param id   采购申请id
     * @param departmentId  部门id
     * @return 采购申请详细信息列表
     */
    // List<PurchaseReportDTO> findAllDone(PurchaseType purchaseType, PurchaseState purchaseState, BudgetApprovalType budgetApprovalType, String id, String departmentId);

    /**
     * 根据ID查询采购申请
     *
     * @param id       采购申请Id
     * @param taskId   任务Id
     * @param isFilter 是否过滤已验收的内容
     * @return 采购申请详细信息
     */
    PurchaseReport findById(String id, String taskId, boolean isFilter);

    /**
     * 新建采购申请
     *
     * @param createInfo 采购申请创建信息
     * @return 采购申请详细信息
     * @throws IOException io异常
     */
    PurchaseReport create(PurchaseReport createInfo) throws IOException;

    /**
     * 提交采购申请
     *
     * @param id       采购申请Id
     * @param editInfo 采购申请编辑信息
     * @return 采购申请详细信息
     */
    PurchaseReport complete(String id, PurchaseReport editInfo) throws IOException;

    /**
     * 删除采购申请
     *
     * @param id 采购申请Id
     */
    void delete(String id);

    /**
     * 获取指标余额
     *
     * @param id  采购申请id
     * @param ids 指标库的id
     * @return 指标余额的map
     */
    Map<String, Double> getIndex(String id, List<String> ids);

    /**
     * 通过采购申请id查询采购品目的信息
     *
     * @param id           采购申请id
     * @param relatedId    关联id   isAcceptance是true时关联的是验收  否则是招标
     * @param isAcceptance 验收/招标
     * @return 采购申请DTO
     */
    PurchaseReport findCategoriesById(String id, String relatedId, Boolean isAcceptance);


    /**
     * 通过采购id和验收id查询未招标的采购类容信息
     *
     * @param id           采购id
     * @param acceptanceId 验收id
     * @return 采购申请DTO
     */
    PurchaseReport findPurchaseContentById(String id, String acceptanceId);

    /**
     * 查询可用余额大于0的采购申请
     *
     * @param departmentId 部门id
     * @param id           采购id
     * @return
     */
    List<PurchaseReport> findAvailable(String departmentId, String id);

    /**
     * 通过采购状态、采购类型、支出类型查询采购申请
     *
     * @return
     */
    List<PurchaseReport> findAll();
}
