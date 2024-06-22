package org.example.Controller;

import org.example.Entity.Lecture;
import org.example.Entity.Member;
import org.example.Service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @GetMapping("/lectureList")
    public String hyo(Model model) {
        List<Lecture> list =lectureService.lectureList();
        model.addAttribute("list",list);

        return "LectureList";
    }
    @GetMapping("/lectureListId")
    public String selectById(@RequestParam("id") int id, Model model) {
        List<Lecture> list =lectureService.lectureListId(id);
        model.addAttribute("list",list);

        return "LectureListId";
    }
    @GetMapping("/lectureInsert")
    public String insert(@ModelAttribute Lecture lecture, Model model) {

        lectureService.lectureInsert(lecture);

        return "LectureInsert";
    }
    @GetMapping("/lectureUpdate")
    public String update(@ModelAttribute Lecture lecture, Model model) {

        lectureService.lectureUpdate(lecture);

        return "LectureUpdate";
    }
    @GetMapping("/lectureDelete")
    public String delete(@RequestParam("id") int id, Model model) {

        lectureService.lectureDelete(id);

        return "LectureDelete";
    }
}
