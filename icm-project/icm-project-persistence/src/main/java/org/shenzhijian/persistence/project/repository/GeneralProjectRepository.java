package org.shenzhijian.persistence.project.repository;

import org.shenzhijian.persistence.project.entity.GeneralProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralProjectRepository extends JpaRepository<GeneralProject, Long>, JpaSpecificationExecutor<GeneralProject> {
}