package com.bridgeLabz.employeepayrollapp.dto;

import lombok.Data;
import org.apache.coyote.Response;

public @Data class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data){
        this.message = message;
        this.data = data;
    }

}
