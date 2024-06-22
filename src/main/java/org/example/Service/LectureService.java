package org.example.Service;
import org.example.Dao.LectureDao;
import org.example.Entity.Lecture;
import org.example.Entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {

    @Autowired
    private LectureDao lectureDao;

    public List<Lecture> lectureList() {
        return lectureDao.lectureList();
    }

    public List<Lecture> lectureListId(int id) {
        return lectureDao.lectureListId(id);
    }

    public void lectureInsert(Lecture lecture){
        lectureDao.lectureInsert(lecture);
    }

    public void lectureUpdate(Lecture lecture){
        lectureDao.lectureUpdate(lecture);
    }

    public void lectureDelete(int id){
        lectureDao.lectureDelete(id);
    }

}