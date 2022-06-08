package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.Tiers;

public interface TiersService {
    Tiers addTiers (Tiers t);
    List<Tiers> listTiers();
    void deleteTiers (Tiers t);
}
