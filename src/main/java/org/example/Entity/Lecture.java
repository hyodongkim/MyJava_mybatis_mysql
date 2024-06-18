package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Lecture {

    private Integer id;
    private String name;
    private Long cost;
    private String subject;
    private Integer totalCount;
    private Integer favorite;
    private String videoName;
    private String videoTime;
    private String teacherName;
    private String teacherSubject;
    private Long hit;
    private Long count;
}
//id Int Not Null auto_increment,
//name Varchar(20) not null,
//cost Long not null,
//subject Varchar(15) not null,
//totalcount int not null,
//favorite int not null,
//video_name varchar(100) not null,
//video_time varchar(100) not null,
//teacher_name varchar(5) not null,
//teacher_subject varchar(15) not null,
//hit int not null default 0,
//count int not null default 0,
//CONSTRAINT lecture_PK PRIMARY KEY(id)
