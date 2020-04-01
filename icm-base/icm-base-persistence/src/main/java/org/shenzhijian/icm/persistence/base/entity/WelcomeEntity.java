package org.shenzhijian.icm.persistence.base.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "welcome")
public class WelcomeEntity {

    /**
     * 供应商分类编号
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 供应商分类名称
     */
    @Column(name = "name", length = 100, nullable = false)
    private String name;

}
