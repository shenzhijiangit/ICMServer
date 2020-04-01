package org.shenzhijian.persistence.purchase.repository;

import org.shenzhijian.persistence.purchase.entity.PurchaseReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Long>, JpaSpecificationExecutor<PurchaseReport> {
}
