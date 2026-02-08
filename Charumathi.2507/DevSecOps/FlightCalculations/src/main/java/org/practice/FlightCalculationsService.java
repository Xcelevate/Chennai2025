package org.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlightCalculationsService {

    public BigDecimal calculateTotalFuelConsumption(
            BigDecimal rate,
            BigDecimal distance,
            int scale,
            RoundingMode mode) {

        BigDecimal total = rate.multiply(distance);
        return total.setScale(scale, mode);
    }

    public BigDecimal calculateTotalFuelCost(
            BigDecimal totalFuel,
            BigDecimal costPerGallon,
            int scale,
            RoundingMode mode) {

        BigDecimal cost = totalFuel.multiply(costPerGallon);
        return cost.setScale(scale, mode);
    }

    public BigDecimal calculateAverageFuelEfficiency(
            BigDecimal distance,
            BigDecimal totalFuel,
            int scale,
            RoundingMode mode) {

        return distance.divide(totalFuel, scale, mode);
    }
}
