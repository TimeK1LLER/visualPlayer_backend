package com.visualplayer.dev.base.json;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class JsonResponse<T> {

    private int code;

    private String codeDes;

    private T data = null;

    public JsonResponse(StatusCode code,T data){
        this.code = code.getCode();
        this.codeDes = code.getDescribe();
        this.data = data;
    }

    public JsonResponse(int code,String des){
        this.code = code;
        this.codeDes = des;
    }

    public JsonResponse(StatusCode code){
        this.code = code.getCode();
        this.codeDes = code.getDescribe();
    }
}
