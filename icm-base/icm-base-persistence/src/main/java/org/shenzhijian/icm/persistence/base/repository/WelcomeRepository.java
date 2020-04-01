package org.shenzhijian.icm.persistence.base.repository;

import org.shenzhijian.icm.persistence.base.entity.WelcomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WelcomeRepository extends JpaRepository<WelcomeEntity, Long>, JpaSpecificationExecutor<WelcomeEntity> {
}
