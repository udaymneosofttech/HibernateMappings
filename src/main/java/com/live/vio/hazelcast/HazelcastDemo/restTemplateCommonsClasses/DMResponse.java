package com.live.vio.hazelcast.HazelcastDemo.restTemplateCommonsClasses;

public class DMResponse<T> implements  IDMResponse<T> {

    T data;
     Integer code;
    T appMessage;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;

    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;

    }

    @Override
    public T getAppMessage() {
        return appMessage;
    }

    @Override
    public void setAppMessage(T appMessage) {
        this.appMessage = appMessage;

    }
}
