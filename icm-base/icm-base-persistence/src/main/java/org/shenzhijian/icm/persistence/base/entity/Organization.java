package org.shenzhijian.icm.persistence.base.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Organization")
@Getter
@Setter
public class Organization {

    /**
     * 单位ID
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 单位名称
     */
    @Column(name = "unitName")
    private String unitName;


    /**
     * 单位名称
     */
    @Column(name = "departmentName")
    private String departmentName;

    /**
     * 单位类型
     */
    @Column(name = "departmentType")
    private String departmentType;
}
