package org.shenzhijian.service.budget;

import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * 项目支出预算服务
 *
 * @author maqionggui
 * @date 2019/10/8
 */
public interface ProjectBudgetService {
    /**
     * 根据ID查询项目支出预算
     *
     * @param id 支出预算Id
     * @return 支出预算详细信息
     */
    ProjectBudget findById(String id) throws IOException;

    /**
     * 分页查询项目支出预算信息
     * @param page 页号，从0开始
     * @param size 每页纪录条数
     * @param sort 排序字段, 例如：字段1,asc,字段2,desc
     * @param departmentId 申报部门
     * @param projectName 项目名称
     * @param projectType 项目类别
     * @param detailedProjectType 项目类别明细
     * @param stateType  状态类型
     * @param projectCode 项目编码
     * @return 分页的支出预算详细信息
     */
    // PageDataDTO<ProjectBudget> findOnePage(int page, int size, String sort, String departmentId, String projectName, String projectType, String detailedProjectType, StateType stateType, String projectCode);

    /**
     * 新建项目支出预算
     *
     * @param projectBudgetCreateInfo 项目支出预算编辑信息
     * @return 支出预算详细信息
     * @throws IOException IO异常
     */
    @Transactional(rollbackFor = Exception.class)
    ProjectBudget create(ProjectBudget projectBudgetCreateInfo) throws IOException;

    /**
     * 提交项目支出预算
     *
     * @param id                    支出预算Id
     * @param projectBudgetEditInfo 项目支出预算编辑信息
     * @return 支出预算详细信息
     */
    @Transactional(rollbackFor = Exception.class)
    ProjectBudget complete(String id, ProjectBudget projectBudgetEditInfo) throws IOException;

    /**
     * 删除项目支出预算
     *
     * @param id 支出预算Id
     * @throws IOException IO异常
     */
    @Transactional(rollbackFor = Exception.class)
    void delete(String id) throws IOException;

    /**
     * 保存关联数据
     *
     * @param budget 预算实体信息
     * @param dto    编辑信息
     * @return 预算实体
     */
    @Transactional(rollbackFor = Exception.class)
    ProjectBudget saveRelation(ProjectBudget budget, ProjectBudget dto);

    /**
     * 删除关联
     *
     * @param budget 预算信息
     */
    @Transactional(rollbackFor = Exception.class)
    void deleteRelation(ProjectBudget budget);

    /**
     * 查询所有
     *
     * @return
     */
    List<ProjectBudget> findAll(String state);
}
