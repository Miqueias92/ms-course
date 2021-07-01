package com.mscourse.hrwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscourse.hrwork.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
