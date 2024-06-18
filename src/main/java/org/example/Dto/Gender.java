package org.example.Dto;

import lombok.Getter;

@Getter
public enum Gender{
    MAN("0"),WOMAN("1");

    private final String CodeSex;

    Gender(String CodeSex){
        this.CodeSex = CodeSex;
    }

    public static Gender lookup(String CodeSex) {
        for (Gender element : Gender.values()) {
            if (element.CodeSex.equalsIgnoreCase(CodeSex)) {
                return element;
            }
        }
        return null;
    }
}
