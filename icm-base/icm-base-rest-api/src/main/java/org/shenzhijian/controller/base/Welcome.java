package org.shenzhijian.controller.base;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.shenzhijian.icm.model.base.WelcomeDTO;
import org.shenzhijian.icm.service.base.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"基础数据的字典表"})
@RestController
@Validated
@RequestMapping("/api/icm-base/welcome")
public class Welcome {

    private WelcomeService welcomeService;

    @Autowired
    public Welcome(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @PostMapping(value = "")
    public WelcomeDTO search(
            @ApiParam(value = "字典表") @RequestBody WelcomeDTO welcomeDTO) {
        return this.welcomeService.welcome(welcomeDTO);
    }
//    private static final String DATA_TYPE = "绩效指标";
//    private PerformanceIndicatorService performanceIndicatorService;
//
//    @Autowired
//    public PerformanceIndicatorController(PerformanceIndicatorService performanceIndicatorService) {
//        this.performanceIndicatorService = performanceIndicatorService;
//    }
//
//    @ApiOperation(value = "模糊查询绩效指标")
//    @GetMapping(value = "/all")
//    public List<PerformanceIndicatorDTO> search(
//            @ApiParam(value = "指标编号") @RequestParam(value = "code", required = false) String code,
//            @ApiParam(value = "指标名称") @RequestParam(value = "name", required = false) String name,
//            @ApiParam(value = "id" ) @RequestParam(value = "id", required = false) String parentId){
//        return this.performanceIndicatorService.search(code,name,parentId);
//    }
//
//    @ApiOperation(value = "新建绩效指标")
//    @PreAuthorize("hasAnyAuthority('PERFORMANCE_INDICATOR_CREATE')")
//    @PostMapping(value = "")
//    public PerformanceIndicatorDTO create(
//            @ApiParam(value = "绩效指标信息", required = true) @RequestBody @Validated PerformanceIndicatorDTO performanceIndicatorDTO) {
//        return this.performanceIndicatorService.create(performanceIndicatorDTO);
//    }
//
//    @ApiOperation(value = "更新绩效指标")
//    @PreAuthorize("hasAnyAuthority('PERFORMANCE_INDICATOR_UPDATE')")
//    @PutMapping(value = "/{id}")
//    public PerformanceIndicatorDTO update(
//            @ApiParam(value = "绩效指标Id", required = true) @PathVariable(name = "id") String id,
//            @ApiParam(value = "绩效指标信息", required = true) @RequestBody @Validated PerformanceIndicatorDTO performanceIndicatorDTO) {
//        return this.performanceIndicatorService.update(id, performanceIndicatorDTO);
//    }
//
//    @ApiOperation(value = "删除绩效指标")
//    @PreAuthorize("hasAnyAuthority('PERFORMANCE_INDICATOR_DELETE')")
//    @DeleteMapping(value = "/{id}")
//    public void delete(
//            @ApiParam(value = "绩效指标Id", required = true) @PathVariable(name = "id") String id) {
//        this.performanceIndicatorService.deleteById(id);
//    }

}
