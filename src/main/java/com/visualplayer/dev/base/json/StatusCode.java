package com.visualplayer.dev.base.json;

public enum StatusCode {
    OK(200,"ok"),

    BAD_REQUEST(400,"Parameter does not match."),
    NEED_AUTH(401,"Action needs authorization"),

    USER_EXIST(1001,"User is existed."),

    SYS_INTERNAL_ERROR(500,"System internal error")
    ;
    int code;
    String describe;

    StatusCode(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }
}
