package org.example.Service;
import org.example.Dao.MemberDao;
import org.example.Entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public List<Member> memberList() {
        return memberDao.memberList();
    }
    public List<Member> memberListId(Integer id) {
        return memberDao.memberListId(id);
    }

    public void memberInsert(Member member){
        memberDao.memberInsert(member);
    }

    public void memberUpdate(Member member){
        memberDao.memberUpdate(member);
    }

    public void memberDelete(Integer id){
        memberDao.memberDelete(id);
    }
}