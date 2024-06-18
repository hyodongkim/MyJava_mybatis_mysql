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

}