package com.example.airline_management.controller;

import com.example.airline_management.model.Ticket;
import com.example.airlinemanagement.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return ticketService.bookTicket(ticket);
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicket(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @DeleteMapping("/{id}")
    public String cancelTicket(@PathVariable Long id) {
        ticketService.cancelTicket(id);
        return "Ticket with ID " + id + " has been cancelled.";
    }
}
