package com.company.aviaries;

import com.company.animals.Herbivore;

public class HerbivoreAviary extends Aviary<Herbivore> {

    public HerbivoreAviary(String name, int limit, int space, SizeAviary size) {
        super(name, limit, space, size);
    }
}



