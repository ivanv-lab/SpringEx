package com.dbcrud.repositories;

import com.dbcrud.models.PickPoint;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PickPointRepository extends CrudRepository<PickPoint, Long> {
    List<PickPoint> findByAddressContainingIgnoreCase(String address);
    PickPoint findById(long id);
}
