package org.shenzhijian.service.budget;


import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.shenzhijian.persistence.budget.repository.ProjectBudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service("projectBudgetService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ProjectBudgetServiceImpl implements ProjectBudgetService {

    private ProjectBudgetRepository projectBudgetRepository;

    @Autowired
    public ProjectBudgetServiceImpl(ProjectBudgetRepository projectBudgetRepository) {
        this.projectBudgetRepository = projectBudgetRepository;
    }

    public ProjectBudget findById(String id) throws IOException {
        Optional<ProjectBudget> optional = projectBudgetRepository.findById(Long.valueOf(id));
        return optional.get();
    }

    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget create(ProjectBudget projectBudgetCreateInfo) throws IOException {
        return this.projectBudgetRepository.save(projectBudgetCreateInfo);
    }

    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget complete(String id, ProjectBudget projectBudgetEditInfo) throws IOException {
        Optional<ProjectBudget> optional = projectBudgetRepository.findById(Long.valueOf(id));
        this.projectBudgetRepository.delete(optional.get());
        return this.projectBudgetRepository.save(projectBudgetEditInfo);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) throws IOException {
        Optional<ProjectBudget> optional = projectBudgetRepository.findById(Long.valueOf(id));
        this.projectBudgetRepository.delete(optional.get());
    }

    @Transactional(rollbackFor = Exception.class)
    public ProjectBudget saveRelation(ProjectBudget budget, ProjectBudget dto) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteRelation(ProjectBudget budget) {

    }

    public List<ProjectBudget> findAll(String state) {
        return null;
    }
}
