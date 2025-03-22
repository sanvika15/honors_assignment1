package com.example.airline_management.service;

import com.example.airline_management.model.Flight;
import com.example.airline_management.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    // Constructor injection of FlightRepository
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    // Method to get all flights
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // Method to get a flight by ID
    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }
}
