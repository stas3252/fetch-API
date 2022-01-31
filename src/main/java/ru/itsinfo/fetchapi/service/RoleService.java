package ru.itsinfo.fetchapi.service;

import org.springframework.lang.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import ru.itsinfo.fetchapi.model.Role;

import javax.servlet.http.HttpSession;

public interface RoleService {
    Iterable<Role> findAllRoles();
    //String getPage(Model model, HttpSession session, @Nullable Authentication auth);
}
