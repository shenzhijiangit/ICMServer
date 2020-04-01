package org.shenzhijian.service.budget;


import org.shenzhijian.persistence.budget.entity.ProjectBudget;

import java.util.List;


public interface BudgetApprovalService {

    /**
     * 分页查询基本支出预算批复详细信息
     *
     * @param page          页号，从0开始
     * @param size          每页纪录条数
     * @param sort          排序字段, 例如：字段1,asc,字段2,desc
     * @param projectName   项目名称
     * @param projectType   项目类别
     * @param unitCharacter 单位性质
     * @return 分页的基本支出预算批复详细信息
     */
    // PageDataDTO<BasicBudgetDTO> findBasicApprovalsOnePage(int page, int size, String sort, String projectName, String projectType, String unitCharacter);

    /**
     * 分页查询项目支出预算批复详细信息
     *
     * @param page                页号，从0开始
     * @param size                每页纪录条数
     * @param sort                排序字段, 例如：字段1,asc,字段2,desc
     * @param code                项目编码
     * @param projectName         项目名称
     * @param projectType         项目类别
     * @param detailedProjectType 项目类别明细
     * @return 分页的预算批复详详细信息
     */
    //  PageDataDTO<ProjectBudget> findProjectApprovalsOnePage(int page, int size, String sort, String code, String projectName, String projectType, String detailedProjectType);

    /**
     * 根据ID查询基本支出预算批复详细信息
     *
     * @param id 预算批复Id
     * @return 基本支出预算批复详细信息
     */
    ProjectBudget findBasicApprovalById(String id);

    /**
     * 根据ID查询项目支出预算批复详细信息
     *
     * @param id 预算批复Id
     * @return 项目支出预算批复详细信息
     */
    ProjectBudget findProjectApprovalById(String id);

    /**
     * 新建项目支出预算批复
     *
     * @param projectBudgetCreateInfoDTO 项目支出预算批复创建信息
     * @return 项目支出预算批复详细信息
     */
    ProjectBudget createProjectApproval(ProjectBudget projectBudgetCreateInfoDTO);

    /**
     * 新建基本支出预算批复
     *
     * @param basicBudgetCreateInfoDTO 基本支出预算批复创建信息
     * @return 基本支出预算批复详细信息
     */
    ProjectBudget createBasicApproval(ProjectBudget basicBudgetCreateInfoDTO);

    /**
     * 修改基本支出预算批复信息
     *
     * @param id                     预算批复id
     * @param basicBudgetEditInfoDTO 基本支出预算批复编辑信息
     * @return 基本支出预算批复详细信息
     */
    ProjectBudget saveBasicApproval(String id, ProjectBudget basicBudgetEditInfoDTO);

    /**
     * 修改项目支出预算批复信息
     *
     * @param id                       预算批复id
     * @param projectBudgetEditInfoDTO 项目支出预算批复编辑信息
     * @return 项目支出预算批复详细信息
     */
    ProjectBudget saveProjectApproval(String id, ProjectBudget projectBudgetEditInfoDTO);

    /**
     * 预算批复确认，批量提交；提交成功后，会插入预算下达表
     *
     * @param ids 预算批复id
     */
    void confirmation(List<String> ids);

    /**
     * 删除预算批复
     *
     * @param id 预算批复id
     */
    void delete(String id);

    /**
     * 根据项目编码查询预算明细及说明
     *
     * @param projectCode 项目编码
     * @return 预算明细及说明
     */
    List<ProjectBudget> findByCode(String projectCode);
}
