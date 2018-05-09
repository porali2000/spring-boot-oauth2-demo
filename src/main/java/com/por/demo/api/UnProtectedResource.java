package com.por.demo.api;

import com.por.demo.model.Foo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UnProtectedResource {

    @RequestMapping("/login")
    public String getAuthenticated(Model model) {
        System.out.println("inside");
        return "";
    }
}