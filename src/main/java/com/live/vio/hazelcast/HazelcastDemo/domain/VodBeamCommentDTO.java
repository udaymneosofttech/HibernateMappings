package com.live.vio.hazelcast.HazelcastDemo.domain;


import java.io.Serializable;


public class VodBeamCommentDTO  implements Serializable {


    int id;


    UserDTO userid;


    String desc;


    VodBeamDTO vodbeam;

    public VodBeamDTO getVodbeam() {
        return vodbeam;
    }

    public VodBeamCommentDTO setVodbeam(VodBeamDTO vodbeam) {
        this.vodbeam = vodbeam;
        return this;
    }

    public int getId() {
        return id;
    }

    public VodBeamCommentDTO setId(int id) {
        this.id = id;
        return this;
    }

    public UserDTO getUserid() {
        return userid;
    }

    public VodBeamCommentDTO setUserid(UserDTO userid) {
        this.userid = userid;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public VodBeamCommentDTO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
