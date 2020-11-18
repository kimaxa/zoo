package com.company.aviaries;

import com.company.animals.Carnivorous;

public class CarnivorousAviary extends Aviary<Carnivorous> {
    public CarnivorousAviary(String name, int limit, int space, SizeAviary sizeAviary) {
        super(name, limit, space, sizeAviary);
    }
}
