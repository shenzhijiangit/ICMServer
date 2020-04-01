package org.shenzhijian.persistence.budget.entity;

import lombok.Getter;
import lombok.Setter;
import org.shenzhijian.icm.persistence.base.entity.Organization;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "ProjectBudget")
public class ProjectBudget {

    /**
     * 预算编制ID
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 项目库ID
     */
//    @OneToOne
//    @JoinColumn(name = "unit_id", nullable = false)
    @Column(name = "generalProjectId", nullable = false)
    private String generalProjectId;

    /**
     * 申报单位
     */
    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private Organization unit;


    /**
     * 申报日期
     */
    @Column(name = "apply_date", nullable = false)
    private Date applyDate;

    /**
     * 年份
     */
    @Column(name = "year", nullable = false, length = 4)
    private Integer year;

    /**
     * 项目编码
     */
    @Column(name = "code", nullable = false, length = 20)
    private String code;

    /**
     * 项目名称
     */
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    /**
     * 申报类型,对于字典表类型: PROJECT_APPLY_TYPE
     */
    @Column(name = "apply_type", nullable = false)
    private String applyType;

    /**
     * 项目类别,对于字典表类型: PROJECT_TYPE
     */
    @Column(name = "project_type", nullable = false)
    private String projectType;

    /**
     * 项目类别明细,对于字典表类型: PROJECT_DETAILED_TYPE
     */
    @Column(name = "project_detailed_type", nullable = false)
    private String projectDetailedType;

    /**
     * 项目属性,对于字典表类型: PROJECT_PROPERTY
     */
    @Column(name = "project_property", nullable = false)
    private String projectProperty;

    /**
     * 项目开始时间
     */
    @Column(name = "begin_time", nullable = false)
    private Date beginTime;

    /**
     * 项目结束时间
     */
    @Column(name = "end_time", nullable = false)
    private Date endTime;

    /**
     * 重要内容,多选下拉框，对于字典表类型: PROJECT_IMPORTANT_CONTENT
     */
    @Column(name = "important_content")
    private String importantContent;


    /**
     * 主管部门联系人
     */
    @Column(name = "administrative_department_link", length = 200)
    private String administrativeDepartmentLink;

    /**
     * 主管部门联系电话
     */
    @Column(name = "administrative_department_telephone", length = 50)
    private String administrativeDepartmentTelephone;

    /**
     * 项目负责人
     */
    @Column(name = "project_leader", length = 200)
    private String projectLeader;

    /**
     * 项目负责人联系电话
     */
    @Column(name = "projectLeader_telephone", length = 50)
    private String projectLeaderTelephone;

    /**
     * 项目负责人手机号码
     */
    @Column(name = "projectLeader_phone", length = 50)
    private String projectLeaderPhone;

    /**
     * 项目实施地址
     */
    @Column(name = "address", length = 500)
    private String address;

    /**
     * 项目实施地点
     */
    @Column(name = "place", length = 500)
    private String place;

    /**
     * 邮政编码
     */
    @Column(name = "post_code", length = 20)
    private String postCode;

    /**
     * 是否政府采购
     */
    @Column(name = "is_gov_purchase")
    private Boolean govPurchase;

    /**
     * 是否政府购买服务
     */
    @Column(name = "is_purchase_service")
    private Boolean purchaseService;

    /**
     * 是否专项业务
     */
    @Column(name = "is_special")
    private Boolean special;

    /**
     * 是否涉密项目
     */
    @Column(name = "is_secret")
    private Boolean secret;

    /**
     * 是否审查
     */
    @Column(name = "is_examine")
    private Boolean examine;

    /**
     * 项目资金性质，对于字典表类型: PROJECT_CAPITAL
     */
    @Column(name = "capital")
    private String capital;

    /**
     * 项目内容简述
     */
    @Column(name = "content", length = 2000)
    private String content;

    /**
     * 项目立项依据
     */
    @Column(name = "basis", length = 500)
    private String basis;

    /**
     * 预算金额合计
     */
    @Column(name = "budget_amount_total")
    private Double budgetAmountTotal;

    /**
     * 会议费合计
     */
    @Column(name = "meeting_fund_total")
    private Double meetingFundTotal;

    /**
     * 培训费合计
     */
    @Column(name = "training_fund_total")
    private Double trainingFundTotal;

    /**
     * 出国境经费合计
     */
    @Column(name = "abroad_fund_total")
    private Double abroadFundTotal;

    /**
     * 总体绩效目标
     */
    @Column(name = "performance_target", length = 2000)
    private String performanceTarget;

    /**
     * 是否可计划
     */
    @Column(name = "available_plan")
    private Boolean availablePlan = true;


}

