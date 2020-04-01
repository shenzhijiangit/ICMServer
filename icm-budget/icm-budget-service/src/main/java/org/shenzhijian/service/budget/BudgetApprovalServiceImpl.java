package org.shenzhijian.service.budget;


import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.shenzhijian.persistence.budget.repository.ProjectBudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true, rollbackFor = Exception.class)
@Service("budgetApprovalService")
public class BudgetApprovalServiceImpl implements BudgetApprovalService {

    private ProjectBudgetRepository projectBudgetRepository;

    @Autowired
    public BudgetApprovalServiceImpl(ProjectBudgetRepository projectBudgetRepository) {
        this.projectBudgetRepository = projectBudgetRepository;
    }

    @Override
    public ProjectBudget findBasicApprovalById(String id) {
        return null;
    }

    @Override
    public ProjectBudget findProjectApprovalById(String id) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget createProjectApproval(ProjectBudget projectBudgetCreateInfoDTO) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget createBasicApproval(ProjectBudget basicBudgetCreateInfoDTO) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget saveBasicApproval(String id, ProjectBudget basicBudgetEditInfoDTO) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget saveProjectApproval(String id, ProjectBudget projectBudgetEditInfoDTO) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void confirmation(List<String> ids) {

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) {

    }

    @Override
    public List<ProjectBudget> findByCode(String projectCode) {
        return null;
    }
}
