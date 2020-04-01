package org.shenzhijian.icm.service.base;

import org.shenzhijian.icm.model.base.WelcomeDTO;
import org.shenzhijian.icm.persistence.base.entity.WelcomeEntity;
import org.shenzhijian.icm.persistence.base.repository.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
//@Transactional(readOnly = true, rollbackFor = Exception.class)
public class WelcomeServiceImpl implements WelcomeService {

    private final WelcomeRepository welcomeRepository;
//    private final

    @Autowired
    public WelcomeServiceImpl(WelcomeRepository welcomeRepository) {
        this.welcomeRepository = welcomeRepository;
    }

    public WelcomeDTO welcome(WelcomeDTO welcomeDTO) {
        WelcomeEntity welcomeEntity = new WelcomeEntity();
        welcomeEntity.setId(Long.parseLong(welcomeDTO.getId()));
        welcomeEntity.setName(welcomeDTO.getName());
        this.welcomeRepository.save(welcomeEntity);
        return welcomeDTO;
    }
}
