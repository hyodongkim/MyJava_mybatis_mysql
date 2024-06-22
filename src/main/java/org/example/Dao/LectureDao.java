package org.example.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.Entity.Lecture;
import org.example.Entity.Member;

import java.util.List;

@Mapper
public interface LectureDao {
    public List<Lecture> lectureList();

    public List<Lecture> lectureListId(int id);

    public void lectureInsert(Lecture lecture);

    public void lectureUpdate(Lecture lecture);

    public void lectureDelete(int id);
}
