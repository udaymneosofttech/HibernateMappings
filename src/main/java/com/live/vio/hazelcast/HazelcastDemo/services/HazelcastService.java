package com.live.vio.hazelcast.HazelcastDemo.services;

import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeam;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;

import java.util.Map;

public interface HazelcastService {

    VodBeamDTO insertBeamDetails(VodBeam vodBeamRequest);

    VodBeamDTO getBeamDetailsById(int beamid);


}
