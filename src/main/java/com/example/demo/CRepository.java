package com.example.demo;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CRepository extends CrudRepository<C, Long> {

    @NotNull List<C> findAllByBbbAaaNotEmpty();

}
