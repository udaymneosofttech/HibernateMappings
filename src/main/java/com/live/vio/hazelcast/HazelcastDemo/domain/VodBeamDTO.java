package com.live.vio.hazelcast.HazelcastDemo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class VodBeamDTO implements Serializable{

    int beamId;
    String beamName;
    String beamType;
    String beamOriented;
    String description;
    String publish;
    BeamDetailsDTO beamdetails;
    List<VodBeamCommentDTO> vodBeamComment = new ArrayList<>(0);

    public List<VodBeamCommentDTO> getVodBeamComment() {
        return vodBeamComment;
    }

    public VodBeamDTO setVodBeamComment(List<VodBeamCommentDTO> vodBeamComment) {
        this.vodBeamComment = vodBeamComment;
        return this;
    }

    public BeamDetailsDTO getBeamdetails() {
        return beamdetails;
    }

    public VodBeamDTO setBeamdetails(BeamDetailsDTO beamdetails) {
        this.beamdetails = beamdetails;
        return this;
    }

    public int getBeamId() {
        return beamId;
    }

    public VodBeamDTO setBeamId(int beamId) {
        this.beamId = beamId;
        return this;
    }

    public String getBeamName() {
        return beamName;
    }

    public VodBeamDTO setBeamName(String beamName) {
        this.beamName = beamName;
        return this;
    }

    public String getBeamType() {
        return beamType;
    }

    public VodBeamDTO setBeamType(String beamType) {
        this.beamType = beamType;
        return this;
    }

    public String getBeamOriented() {
        return beamOriented;
    }

    public VodBeamDTO setBeamOriented(String beamOriented) {
        this.beamOriented = beamOriented;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VodBeamDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPublish() {
        return publish;
    }

    public VodBeamDTO setPublish(String publish) {
        this.publish = publish;
        return this;
    }
}
