package ru.itsinfo.fetchapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import ru.itsinfo.fetchapi.model.Role;
import ru.itsinfo.fetchapi.model.User;
import ru.itsinfo.fetchapi.repository.RoleRepository;
import ru.itsinfo.fetchapi.service.RoleService;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.Objects;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Iterable<Role> findAllRoles() {
        return roleRepository.findAll();
    }
/*
    public String getPage(Model model, HttpSession session, @Nullable Authentication auth) {
        if (Objects.isNull(auth)) {
            model.addAttribute("authenticatedName", session.getAttribute("authenticatedName"));
            session.removeAttribute("authenticatedName");

            model.addAttribute("authenticationException", session.getAttribute("authenticationException"));
            session.removeAttribute("authenticationException");

            return "login-page";
        }

        User user = (User) auth.getPrincipal();
        model.addAttribute("user", user);

        if (user.hasRole("ROLE_ADMIN")) {
            return "main-page";
        }

        if (user.hasRole("ROLE_USER")) {
            return "user-page";
        }

        return "access-denied-page";

    }*/
}
