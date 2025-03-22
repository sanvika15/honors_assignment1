package com.example.airline_management.repository;

import com.example.airlinemanagement.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
