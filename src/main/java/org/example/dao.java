package org.example;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface dao {
    public List<dto> list();
}