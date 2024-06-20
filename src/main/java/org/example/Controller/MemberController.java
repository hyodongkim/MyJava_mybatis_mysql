package org.example.Controller;

import org.example.Entity.Member;
import org.example.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/memberList")
    public String select(Model model) {
        List<Member> list =memberService.memberList();
        model.addAttribute("list",list);

        return "Member";
    }
    @GetMapping("/memberListId")
    public String selectById(@RequestParam("id") int id, Model model) {
        List<Member> list =memberService.memberListId(id);
        model.addAttribute("list",list);

        return "Member";
    }
    @GetMapping("/memberInsert")
    public String insert(@ModelAttribute Member member, Model model) {

        memberService.memberInsert(member);

        return "Member";
    }
    @GetMapping("/memberUpdate")
    public String update(@RequestParam("id") int id, Model model) {

        model.addAttribute("list",memberService.memberUpdate(id));

        return "Member";
    }
    @GetMapping("/memberDelete")
    public String delete(@RequestParam("id") int id, Model model) {

        memberService.memberDelete(id);

        return "Member";
    }
}
