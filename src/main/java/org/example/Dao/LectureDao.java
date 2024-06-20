package org.example.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.Entity.Lecture;

import java.util.List;

@Mapper
public interface LectureDao {
    public List<Lecture> lectureList();
}
