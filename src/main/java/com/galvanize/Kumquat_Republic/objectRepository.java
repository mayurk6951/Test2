package com.galvanize.Kumquat_Republic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public abstract class objectRepository implements CrudRepository<ObjectFrame, String> {

    public abstract Optional<ObjectFrame> findByBrand(String brand);

    public abstract Optional<ObjectFrame> findByColor(String color);

    public abstract Optional<ObjectFrame> filterByPrice(Double price1, Double price2);

    public abstract Optional<ObjectFrame> filter(String brand, String color);

    public abstract Optional<ObjectFrame> getbypriceasc();

    public abstract Optional<ObjectFrame> getbypricedesc();
}
