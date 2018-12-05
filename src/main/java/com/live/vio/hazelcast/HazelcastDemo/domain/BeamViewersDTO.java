package com.live.vio.hazelcast.HazelcastDemo.domain;

import java.io.Serializable;

public class BeamViewersDTO  implements Serializable {

    private  int id;
    private int viewerid;
    private String viewername;
    private Long viewerfollers;

    public int getId() {
        return id;
    }

    public BeamViewersDTO setId(int id) {
        this.id = id;
        return this;
    }

    public int getViewerid() {
        return viewerid;
    }

    public BeamViewersDTO setViewerid(int viewerid) {
        this.viewerid = viewerid;
        return this;
    }

    public String getViewername() {
        return viewername;
    }

    public BeamViewersDTO setViewername(String viewername) {
        this.viewername = viewername;
        return this;
    }

    public Long getViewerfollers() {
        return viewerfollers;
    }

    public BeamViewersDTO setViewerfollers(Long viewerfollers) {
        this.viewerfollers = viewerfollers;
        return this;
    }


}
