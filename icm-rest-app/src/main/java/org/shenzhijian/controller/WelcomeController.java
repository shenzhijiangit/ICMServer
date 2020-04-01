package org.shenzhijian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@ConditionalOnMissingClass(value = {"org.shenzhijian.controller.WelcomeController"})
public class WelcomeController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    private static final String DATABASE_H2 = "h2";

    @GetMapping(value = "/")
    public String welcome(Model model) {
        model.addAttribute("swagger", "swagger-ui.html");
        if (StringUtils.endsWithIgnoreCase(activeProfile, DATABASE_H2)) {
            model.addAttribute(DATABASE_H2, "h2-console");
        }
        return "welcome";
    }
}
