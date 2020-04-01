package org.shenzhijian.service.project;


import org.shenzhijian.persistence.project.entity.GeneralProject;
import org.shenzhijian.persistence.project.repository.GeneralProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service("generalProjectService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class GeneralProjectServiceImpl implements GeneralProjectService {

    private GeneralProjectRepository generalProjectRepository;

    @Autowired
    public GeneralProjectServiceImpl(GeneralProjectRepository generalProjectRepository) {
        this.generalProjectRepository = generalProjectRepository;
    }

    @Transactional(rollbackFor = Exception.class)
    public GeneralProject create(GeneralProject generalProject) throws IOException {
        //省略一些业务操作xx
        //
        return this.generalProjectRepository.save(generalProject);
    }

    @Transactional(rollbackFor = Exception.class)
    public GeneralProject complete(String id, GeneralProject generalProjectEditInfo) throws IOException {
        return null;
    }

    public GeneralProject findById(String id) throws IOException {
        //java 8 的新特性Optional容器 能很好地处理常用的空指针异常
        Optional<GeneralProject> optional = generalProjectRepository.findById(Long.valueOf(id));
        //这里应该判断的为不为空的，为空抛异常的TODO
        return optional.get();
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(String id) throws IOException {
        Optional<GeneralProject> optional = generalProjectRepository.findById(Long.valueOf(id));
        // 判断 是否存在
        //GeneralProject project = optional.orElseThrow(() -> new NoSuchDataException(id));
        this.generalProjectRepository.delete(optional.get());
    }

    public List<GeneralProject> findAll(String unitId, String departmentId, String name, String projectType, String detailedProjectType, Boolean availablePlan) throws IOException {

        return null;
    }

    public GeneralProject collect(List<String> ids) throws IOException {
        return null;
    }

    public void submitToFinance(List<String> ids) {

    }
}
