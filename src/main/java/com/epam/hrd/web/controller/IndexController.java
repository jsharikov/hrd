package com.epam.hrd.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private SessionRegistry sessionRegistry;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest req) {
        List<Object> principals = sessionRegistry.getAllPrincipals();
        List<String> usersNamesList = new ArrayList<>();
        for (Object principal: principals) {
            if (principal instanceof User) {
                usersNamesList.add(((User) principal).getUsername());
            }
        }
        model.addAttribute("users", usersNamesList);
        return "index";
    }

    @RequestMapping("/create")
    public String create() {
        return "create";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete";
    }
}
