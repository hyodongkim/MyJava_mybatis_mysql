package org.example.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.Entity.Member;

import java.util.List;

@Mapper
public interface MemberDao {
    public List<Member> memberList();

    public List<Member> memberListId(Integer id);

    public void memberInsert(Member member);

    public void memberUpdate(Member member);

    public void memberDelete(Integer id);
}