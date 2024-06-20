package org.example.Entity;

import lombok.*;
import org.example.Dto.Gender;
import org.example.Dto.JobClass;
import org.example.Dto.JoinYesOrNo;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Member {
    private Integer id;
    private String memberId;
    private String password;
    private Integer age;
    private String name;
    private Integer year;
    private Integer month;
    private Integer day;
    private String sex;
    private String memberJoin;
    private String email;
    private Integer countView;
    private Integer countHit;
    private String job;
    private String introduce;
    private Integer money;
    private String image;
    private LocalDateTime joinTime;

    @Builder
    public Member(Integer id, String memberId, String password, Integer age, String name, Integer year, Integer month, Integer day, String sex, String memberJoin, String email, Integer countView, Integer countHit, String job, String introduce, Integer money, String image, LocalDateTime joinTime) {
        this.id = id;
        this.memberId = memberId;
        this.password = password;
        this.age = age;
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.sex = sex;
        this.memberJoin = memberJoin;
        this.email = email;
        this.countView = countView;
        this.countHit = countHit;
        this.job = job;
        this.introduce = introduce;
        this.money = money;
        this.image = image;
        this.joinTime = joinTime;
    }
}
