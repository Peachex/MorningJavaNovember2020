package com.epam.calendar.entity;

import java.time.LocalDate;

public class Calendar {
    private LocalDate date;

    public Calendar(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calendar{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}