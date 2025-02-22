package com.wk6.assignment4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wk6.assignment4.model.WorkshopRegistration;


@Repository
public interface WorkshopRegistrationRepo extends CrudRepository<WorkshopRegistration, Long> {
}