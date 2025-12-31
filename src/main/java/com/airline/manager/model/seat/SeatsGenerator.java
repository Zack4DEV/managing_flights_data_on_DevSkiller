package com.airline.manager.model.seat;

import java.util.HashSet;
import java.util.Set;

public class SeatsGenerator {

	public Set<Seat> createSeats(int rows, int seatsInRow, int firstRowNumber) {
		
		// TODO: Implement
		Set<Seat> seats = new HashSet<>();
		for (int i = 0; i < rows; i++) {
		int rowNumber = firstRowNumber + i;
		for (int j = 0; j < seatsInRow; j++) {
			char seatLetter = (char) ('A' + j);
			String seatId = rowNumber + String.valueOf(seatLetter);
			seats.add(new Seat(seatId));
		}
	}
	return seats;

		
	}
}
