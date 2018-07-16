package com.springboot.demo.dao;

import com.springboot.demo.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal,Long> {
}
