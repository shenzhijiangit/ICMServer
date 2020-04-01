package org.shenzhijian.persistence.budget.repository;

import org.shenzhijian.persistence.budget.entity.ProjectBudget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectBudgetRepository extends JpaRepository<ProjectBudget, Long>, JpaSpecificationExecutor<ProjectBudget> {
}
