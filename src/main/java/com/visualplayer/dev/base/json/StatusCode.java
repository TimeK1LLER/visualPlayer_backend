package com.visualplayer.dev.base.json;

public enum StatusCode {
    OK(200,"ok"),
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
