package ADVANCE_JAVA.LATEST_JAVA_FEATURES;

import java.time.*;
import java.time.format.DateTimeFormatter;

/*
 * Earlier java date and time api issues
 *   - Two packages are available for same class in SQL and Java, which was confusing
 *   - To format date we are using java text package
 *   - It was not thread safe
 * New DateTime API
 *   - It is immutable.
 *   - Special package java.time
 *   - More simple to use.
 *   - Features
 *       - Local Date, Local Time, Local Date Time, Instant
 *       - Can have date and time in different format like Only date/time, machine and human-readable time
 *       - Zone ID
 *       - Month ENUM
 *       - Customize every value to time like hr min second and millisecond
 *       - Get time according to different time zone
 *
 * */
public class DateTimeAPIJava8 {
    public static void main(String[] args) {
        learnLocalDateApi();
        learnLocalTimeApi();
        learnLocalDateTimeApi();

        formattingDateAndTime();
        periodConcept();
        durationConcept();
    }

    /*
     * Duration
     * - Represents a time-based amount of time in terms of seconds and nanoseconds.
     * - It is typically used for measuring time between two Instant, LocalTime, or LocalDateTime instances, or when working with finer time units like hours, minutes, and seconds.
     *
     * Key Features:
     * - Represents a duration in seconds and nanoseconds.
     * - Suitable for tasks like measuring elapsed time or handling time intervals shorter than a day.
     * Usage:
     * Creation: Duration.ofHours(long hours), Duration.ofMinutes(long minutes), or Duration.between(startTime, endTime) to find the duration between two Instant, LocalTime, or LocalDateTime.
     * Manipulation: Add or subtract a Duration to/from a LocalTime or LocalDateTime.
     *
     * Duration.between(Temporal startInclusive, Temporal endExclusive): Finds the duration between two time-based objects like Instant, LocalTime, or LocalDateTime.
     * Duration.ofHours(long hours), Duration.ofMinutes(long minutes): Creates a Duration instance.
     * plus(), minus(): You can add or subtract durations from a time-based object.
     */
    private static void durationConcept() {
        // Creating a Duration of 2 hours
        Duration twoHours = Duration.ofHours(2);
        System.out.println("Duration: " + twoHours);

        // Calculating the duration between two LocalTime objects
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(12, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between times: " + duration.toHours() + " hours");

        // Adding a duration to a time
        LocalTime newTime = startTime.plus(duration);
        System.out.println("New Time after adding duration: " + newTime);
    }

    /*
     * Period represents a date-based amount of time in terms of years, months, and days.
     * It is typically used to calculate differences between two LocalDate objects or to add/subtract date-based units (like years, months, or days) to a LocalDate.
     * Key Features:
     * Represents a period as a combination of years, months, and days.
     * Useful for operations like finding age, or calculating the difference between two dates.
     * Usage:
     * Creation: Period.of(int years, int months, int days) or using Period.between(startDate, endDate) to find the difference between two LocalDate objects.
     * Manipulation: You can add or subtract a Period from a LocalDate.
     * <p>
     * Period.between(LocalDate startDate, LocalDate endDate): Finds the period between two LocalDate instances.
     * Period.of(int years, int months, int days): Creates a Period instance.
     * plus(), minus(): You can add or subtract periods from LocalDate.
     */
    private static void periodConcept() {
        // Creating a Period of 2 years, 3 months, and 10 days
        Period period = Period.of(2, 3, 10);
        System.out.println("Period: " + period);

        // Calculating the difference between two dates
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 9, 27);
        Period difference = Period.between(startDate, endDate);
        System.out.println("Difference: " + difference.getYears() + " years, " +
                difference.getMonths() + " months, " +
                difference.getDays() + " days");

        // Adding a period to a date
        LocalDate newDate = endDate.plus(difference);
        System.out.println("New Date after adding difference: " + newDate);
    }

    /**
     * DateTimeFormatter is the replacement for the old SimpleDateFormat class. It is used to format and parse dates and times in a thread-safe and flexible way.
     * <p>
     * Key Features:
     * Thread-Safe: Unlike SimpleDateFormat, DateTimeFormatter is immutable and thread-safe.
     * Predefined Formats: It comes with predefined formatters like ISO_LOCAL_DATE, ISO_LOCAL_TIME, ISO_LOCAL_DATE_TIME, and more.
     * Custom Formats: You can define custom date/time patterns.
     * Usage:
     * Formatting: Converts LocalDate, LocalTime, LocalDateTime, etc., to a String.
     * Parsing: Converts a String to LocalDate, LocalTime, LocalDateTime, etc.
     * <p>
     * DateTimeFormatter.ISO_LOCAL_DATE: yyyy-MM-dd (e.g., 2024-09-27)
     * DateTimeFormatter.ISO_LOCAL_TIME: HH:mm:ss (e.g., 11:45:00)
     * DateTimeFormatter.ISO_LOCAL_DATE_TIME: yyyy-MM-dd'T'HH:mm:ss (e.g., 2024-09-27T11:45:00)
     */
    private static void formattingDateAndTime() {
        // Formatting a LocalDateTime to String
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Parsing a String to LocalDateTime
        String dateTimeString = "2024-09-27 11:45:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);
    }

    private static void learnLocalDateTimeApi() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//2024-09-23T17:47:19.059725
    }

    private static void learnLocalTimeApi() {
        LocalTime time = LocalTime.now();
        Instant instant = Instant.now();// machine-readable or full date and time
        ZoneId.getAvailableZoneIds();
        LocalTime timeZone = LocalTime.now(ZoneId.of("GMT"));
        LocalTime customTime = LocalTime.of(12, 1, 1);
        System.out.println(time);//17:47:19.044074
        System.out.println(instant);//2024-09-23T12:17:19.044074Z Machine readable
        System.out.println(customTime);//12:01:01
    }

    private static void learnLocalDateApi() {
        LocalDate date = LocalDate.now();// * Will give me only date instead of both date and time like earlier.
        LocalDate customDate = LocalDate.of(2000, 2, 7);// * Use this
//        LocalDate customDate = LocalDate.of(2000,2,30);// As mentioned 30 in the date and FEB 30 is an invalid date we will get a Runtime DateTimeException
        LocalDate customDateReadable = LocalDate.of(2000, Month.FEBRUARY, 7);// Which is more readable
        System.out.println(date);//2024-09-23
        System.out.println(customDate);//2000-02-07
        System.out.println(customDateReadable);//2000-02-07
    }
}
