package org.example.Controller;

import org.example.Entity.Lecture;
import org.example.Service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @GetMapping("/lecture")
    public String hyo(Model model) {
        List<Lecture> list =lectureService.list();
        model.addAttribute("list",list);

        return "Lecture";
    }
}
