package org.example.Controller;

import org.example.Entity.Member;
import org.example.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member")
    public String hyo(Model model) {
        List<Member> list =memberService.memberList();
        model.addAttribute("list",list);

        return "Member";
    }
}
