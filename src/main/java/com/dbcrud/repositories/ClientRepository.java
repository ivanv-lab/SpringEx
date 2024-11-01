package com.dbcrud.repositories;

import com.dbcrud.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client,Long> {
    List<Client> findByFioContainingIgnoreCase(String fio);
    Client findById(long id);
}
