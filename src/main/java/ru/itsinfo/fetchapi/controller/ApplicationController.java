package ru.itsinfo.fetchapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itsinfo.fetchapi.service.RoleService;

import javax.servlet.http.HttpSession;

@Controller
public class ApplicationController {

    private final RoleService roleService;

    @Autowired
    public ApplicationController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping({"", "/"})
    public String main(Model model, HttpSession session, @Nullable Authentication auth) {
        return roleService.getPage(model, session, auth);
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied-page";
    }
}
