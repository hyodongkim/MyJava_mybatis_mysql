package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class MyController {

    @Autowired
    private service Service;

    @GetMapping("/test")
    public String hyo(Model model) {
        List<dto> list =Service.listlist();
        model.addAttribute("list",list);

        return "test";
    }
}