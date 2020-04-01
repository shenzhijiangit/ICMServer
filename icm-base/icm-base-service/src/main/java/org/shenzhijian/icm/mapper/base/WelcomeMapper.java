package org.shenzhijian.icm.mapper.base;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.shenzhijian.icm.model.base.WelcomeDTO;
import org.shenzhijian.icm.persistence.base.entity.WelcomeEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WelcomeMapper {

    WelcomeDTO toDTO(WelcomeEntity welcomeEntity);


    WelcomeEntity toEntity(WelcomeDTO welcomeDTO);
}
