package org.shenzhijian.service.purchase;

import org.shenzhijian.persistence.purchase.entity.PurchaseReport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Map;


@Service("purchaseReportService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class PurchaseReportServiceImpl implements PurchaseReportService {
    public PurchaseReport findById(String id, String taskId, boolean isFilter) {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public PurchaseReport create(PurchaseReport createInfo) throws IOException {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public PurchaseReport complete(String id, PurchaseReport editInfo) throws IOException {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) {

    }

    public Map<String, Double> getIndex(String id, List<String> ids) {
        return null;
    }

    public PurchaseReport findCategoriesById(String id, String relatedId, Boolean isAcceptance) {
        return null;
    }

    public PurchaseReport findPurchaseContentById(String id, String acceptanceId) {
        return null;
    }

    public List<PurchaseReport> findAvailable(String departmentId, String id) {
        return null;
    }

    public List<PurchaseReport> findAll() {
        return null;
    }
}
