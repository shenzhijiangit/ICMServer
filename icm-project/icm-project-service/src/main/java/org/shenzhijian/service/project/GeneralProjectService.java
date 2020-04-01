package org.shenzhijian.service.project;

import org.shenzhijian.persistence.project.entity.GeneralProject;

import java.io.IOException;
import java.util.List;

/**
 * 项目库服务接口
 *
 * @author maqionggui
 * @date 2019/9/24
 */
public interface GeneralProjectService {
    /**
     * 分页查询项目库信息
     *
     * @param page                页号，从0开始
     * @param size                每页纪录条数
     * @param sort                排序字段, 例如：字段1,asc,字段2,desc
     * @param departmentId        申报部门
     * @param name                项目名称
     * @param projectType         项目类别
     * @param detailedProjectType 项目类别明细
     * @param code                项目编号
     * @param year                申报年份
     * @return 分页的项目库信息
     */
    //PageDataDTO<GeneralProject> findOnePage(int page, int size, String sort, String departmentId, String name, String projectType, String detailedProjectType, String code, String year, StateType stateType, BusinessStep step) throws IOException;

    /**
     * 新建项目库
     *
     * @param generalProject 项目库编辑信息
     * @return 项目库详细信息
     */
    GeneralProject create(GeneralProject generalProject) throws IOException;

    /**
     * 提交项目库
     *
     * @param id                     项目Id
     * @param generalProjectEditInfo 项目库编辑信息
     * @return 项目库详细信息
     */
    GeneralProject complete(String id, GeneralProject generalProjectEditInfo) throws IOException;

    /**
     * 根据ID查询项目库
     *
     * @param id 项目Id
     * @return 项目库详细信息
     */
    GeneralProject findById(String id) throws IOException;

    /**
     * 删除项目库
     *
     * @param id 项目Id
     */
    void delete(String id) throws IOException;

    /**
     * @param unitId              申报单位
     * @param departmentId        申报部门
     * @param name                项目名称
     * @param projectType         项目类别
     * @param detailedProjectType 项目类别明细
     */
    List<GeneralProject> findAll(String unitId, String departmentId, String name, String projectType, String detailedProjectType, Boolean availablePlan) throws IOException;

    /**
     * @param ids 项目ID集合
     */
    GeneralProject collect(List<String> ids) throws IOException;


    /**
     * @param ids 项目ID集合
     */
    void submitToFinance(List<String> ids);
}
