package com.SpringBootProject.GithubTrendingCLI.Utils;

import java.time.LocalDate;

public class DateUtil {
    public static String calculateDate(String duration) {
        LocalDate date = LocalDate.now();
        return switch (duration.toLowerCase()) {
            case "day" -> date.minusDays(1).toString();
            case "week" -> date.minusWeeks(1).toString();
            case "month" -> date.minusMonths(1).toString();
            case "year" -> date.minusYears(1).toString();
            default -> throw new IllegalArgumentException("Invalid duration");
        };
    }
}

