package org.example.Service;
import org.example.Dao.LectureDao;
import org.example.Entity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {

    @Autowired
    private LectureDao lectureDao;

    public List<Lecture> list() {
        return lectureDao.list();
    }

}