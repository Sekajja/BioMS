package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacemaker.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
