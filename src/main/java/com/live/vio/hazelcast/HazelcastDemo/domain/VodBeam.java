package com.live.vio.hazelcast.HazelcastDemo.domain;

public class VodBeam {

    int beamId;
    String beamName;
    String beamType;
    String beamOriented;
    String description;
    String publish;

    public int getBeamId() {
        return beamId;
    }

    public VodBeam setBeamId(int beamId) {
        this.beamId = beamId;
        return this;
    }

    public String getBeamName() {
        return beamName;
    }

    public VodBeam setBeamName(String beamName) {
        this.beamName = beamName;
        return this;
    }

    public String getBeamType() {
        return beamType;
    }

    public VodBeam setBeamType(String beamType) {
        this.beamType = beamType;
        return this;
    }

    public String getBeamOriented() {
        return beamOriented;
    }

    public VodBeam setBeamOriented(String beamOriented) {
        this.beamOriented = beamOriented;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VodBeam setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPublish() {
        return publish;
    }

    public VodBeam setPublish(String publish) {
        this.publish = publish;
        return this;
    }
}
