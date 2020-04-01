package org.shenzhijian.icm.model.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@ApiModel(description = "字典表")
@Data
public class WelcomeDTO {
    @ApiModelProperty(position = 100, value = "ID，新建时无需输入")
    private String id;

    @ApiModelProperty(position = 120, value = "名称", required = true)
    @NotNull
    @Size(max = 100)
    private String name;
}
