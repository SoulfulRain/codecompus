package com.rainsoul.subject.common.enums;

import lombok.Getter;

/**
 * 题目类型枚举
 * 1单选 2多选 3判断 4简答
 */
@Getter
public enum SubjectInfoTypeEnum {

    RADIO(1, "单选"),
    MULTIPLE(2, "多选"),
    JUDGE(3, "判断"),
    BRIEF(4, "简答");

    private Integer code;
    private String message;

    SubjectInfoTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static SubjectInfoTypeEnum getByCode(int codeVal) {
        for (SubjectInfoTypeEnum resultCodeEnum : SubjectInfoTypeEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
