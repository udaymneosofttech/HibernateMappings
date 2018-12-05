package com.live.vio.hazelcast.HazelcastDemo.response.impl;

import com.live.vio.hazelcast.HazelcastDemo.response.IApIResponse;

public class APIResponse<T> implements IApIResponse<T>{

    T data;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T var1) {
        this.data=var1;

    }
}
