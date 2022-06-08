package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.CrossParity;

public interface CrossParityService {
    CrossParity addCrossParity(CrossParity cp);
    List<CrossParity> listCrossParity();
    void deleteCrossParity(CrossParity cp);
}
