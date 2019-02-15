package com.visualplayer.dev.base.json;

public class JsonResponse<T> {

    private int code;

    private String codeDes;

    private T data = null;

    public JsonResponse(StatusCode code,T data){
        this.code = code.getCode();
        this.codeDes = code.getDescribe();
        this.data = data;
    }

    public JsonResponse(StatusCode code){
        this.code = code.getCode();
        this.codeDes = code.getDescribe();
    }
}
