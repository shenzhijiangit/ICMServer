package org.shenzhijian.persistence.purchase.entity;

import lombok.Getter;
import lombok.Setter;
import org.shenzhijian.icm.persistence.base.entity.Organization;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "purchase_report")
@Getter
@Setter
public class PurchaseReport {

    /**
     * 申请单号
     */
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    /**
     * 申请日期
     */
    @Column(name = "apply_date", nullable = false)
    private Date applyDate;


    /**
     * 是否计划
     */
    @Column(name = "is_plan", nullable = false)
    private Boolean plan;

    /**
     * 业务标题
     */
    @Column(name = "title", nullable = false, length = 500)
    private String title;

    /**
     * 采购事由
     */
    @Column(name = "reason", length = 500)
    private String reason;

    /**
     * 业务依据及内容
     */
    @Column(name = "basis", length = 500)
    private String basis;

    /**
     * 采购本年支出总金额（元）
     */
    @Column(name = "current_year_total")
    private Double currentYearTotal;

    /**
     * 采购总金额（元）
     */
    @Column(name = "total")
    private Double total;

    /**
     * 单位
     */
    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private Organization unit;

}
