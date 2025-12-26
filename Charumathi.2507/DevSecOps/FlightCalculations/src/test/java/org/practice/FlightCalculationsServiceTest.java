package org.practice;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightCalculationsServiceTest {

    FlightCalculationsService service = new FlightCalculationsService();

    @Test
    void shouldCalculateTotalFuelConsumption() {
        BigDecimal result = service.calculateTotalFuelConsumption(
                new BigDecimal("2.5"),
                new BigDecimal("100"),
                2,
                RoundingMode.HALF_UP
        );
        assertEquals(new BigDecimal("250.00"), result);
    }

    @Test
    void shouldCalculateTotalFuelCost() {
        BigDecimal result = service.calculateTotalFuelCost(
                new BigDecimal("250.00"),
                new BigDecimal("3.20"),
                2,
                RoundingMode.HALF_UP
        );
        assertEquals(new BigDecimal("800.00"), result);
    }

    @Test
    void shouldCalculateAverageFuelEfficiency() {
        BigDecimal result = service.calculateAverageFuelEfficiency(
                new BigDecimal("500"),
                new BigDecimal("250"),
                2,
                RoundingMode.HALF_UP
        );
        assertEquals(new BigDecimal("2.00"), result);
    }
}
