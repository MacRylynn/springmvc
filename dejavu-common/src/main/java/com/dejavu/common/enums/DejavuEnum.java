package com.dejavu.common.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName DejavuEnum
 * @Description
 * @Author: lijiao73
 * @Date: 2019/10/17 15:46
 */
public enum DejavuEnum {
    DEV(0, "开发"),
    BETA(1, "测试"),;

    private Integer code;
    private String desc;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    DejavuEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    private static final Map<Integer, DejavuEnum> MAP = Arrays.stream(values())
            .collect(Collectors.toMap(DejavuEnum::getCode, Function.identity()));

    public static DejavuEnum getEnum(Integer code) {
        return MAP.get(code);
    }
}
