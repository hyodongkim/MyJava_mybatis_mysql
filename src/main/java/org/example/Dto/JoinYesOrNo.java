package org.example.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(force = true)
public enum JoinYesOrNo{
    JOIN(0),NOTJOIN(1);

    private final int CodeJoin;

    JoinYesOrNo(int CodeJoin){
        this.CodeJoin = CodeJoin;
    }

    public static JoinYesOrNo valueOf(int CodeJoin) {
        switch(CodeJoin) {
            case 0: return JoinYesOrNo.JOIN;
            case 1: return JoinYesOrNo.NOTJOIN;
            default:
                throw new AssertionError("성별: " + CodeJoin);
        }
    }
}