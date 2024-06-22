package org.example.Entity;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {

    private Integer id;
    private String name;
    private Integer cost;
    private String subject; //ENUM('JAVA','JAVASCRIPT','REACT','NODE.JS','ORACLE','MYSQL','JSP','THYMELEAF')
    private Integer totalCount;
    private String favorite; //ENUM('YES','NO')
    private String videoName;
    private String videoTime;
    private String teacherName;
    private String teacherSubject; //ENUM('JAVA','JAVASCRIPT','REACT','NODE.JS','ORACLE','MYSQL','JSP','THYMELEAF')
    private Integer hit;
    private Integer count;
    private Integer memberId;
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
