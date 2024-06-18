package org.example.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(force = true)
public enum JobClass {
    STUDENT(0),TEACHER(1),ADMIN(2);

    private final int CodeJob;

    JobClass(int CodeJob){
        this.CodeJob = CodeJob;
    }

    public static JobClass valueOf(int CodeJob) {
        switch(CodeJob) {
            case 0: return JobClass.STUDENT;
            case 1: return JobClass.TEACHER;
            case 2: return JobClass.ADMIN;
            default:
                throw new AssertionError("성별: " + CodeJob);
        }
    }
}
