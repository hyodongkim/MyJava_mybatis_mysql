package org.example.Controller;

import org.example.Entity.Member;
import org.example.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

        return "MemberList";
    }
    @GetMapping("/memberListId")
    public String selectById(@RequestParam(required = false) Integer id , Model model) {

        List<Member> list;
        if(id!=null) {
            list = memberService.memberListId(id);
        }
        else {
            list = memberService.memberList();
        }
        model.addAttribute("list", list);
        return "MemberListId";
    }
    @GetMapping("/memberInsert")
    public String insert(@ModelAttribute Member member, Model model) {

        List<Member> list =memberService.memberList();
        model.addAttribute("list",list);

        memberService.memberInsert(member);

        return "MemberInsert";
    }
    @GetMapping("/memberUpdate")
    public String update(@ModelAttribute Member member,@RequestParam(required = false) Integer id, Model model) {

        List<Member> list = null;
        if (id != null) {
            list = memberService.memberListId(id);
        } else {
            list = memberService.memberList();
        }
        model.addAttribute("list",list);

        return "MemberUpdate";
    }

    @PostMapping("/memberUpdate")
    public String updatePost(@ModelAttribute Member member,@RequestParam(required = false) Integer id, Model model) {

        memberService.memberUpdate(member);
        List<Member> list = memberService.memberList();


        return "MemberList";
    }


    @GetMapping("/memberDelete")
    public String delete(@RequestParam("id") int id, Model model) {

        List<Member> list =memberService.memberList();
        model.addAttribute("list",list);

        memberService.memberDelete(id);

        return "MemberDelete";
    }
}
