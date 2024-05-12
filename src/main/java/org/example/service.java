package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service{

    @Autowired
    private dao Dao;

    public List<dto> listlist() {
        return Dao.list();
    }

}