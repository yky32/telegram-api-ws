package com.quinsic.telegram.exception;

import com.quinsic.telegram.util.response.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends RuntimeException {
    private Response response;
    private String field;
    private String value;

    public BizException(Response response, String field, String value) {
        super(String.format(response.getMessage().concat("[%s] : ['%s']"), field, value));
        this.response = response;
        this.field = field;
        this.value = value;
    }

    public BizException(Response response, String field) {
        super(String.format(response.getMessage().concat("[%s]"), field));
        this.response = response;
        this.field = field;
    }

    public BizException(Response response) {
        super(response.getMessage());
        this.response = response;
    }
}
