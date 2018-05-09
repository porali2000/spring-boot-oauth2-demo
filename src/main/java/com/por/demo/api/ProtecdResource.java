package com.por.demo.api;

import com.por.demo.model.Foo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@RestController(value = "rest")
public class ProtecdResource {

    @RequestMapping(value = "getSecret")
    public String getSecret() {
        System.out.println("inside");
        return "{'xxx':'yyyy'}";
    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    @ResponseBody
    public Foo findById(@PathVariable long id) {
        return
                new Foo(UUID.randomUUID().toString(), UUID.randomUUID().toString());
    }
}