package com.epam.lastdigit.entity;

public class Number {
    private int value;

    public Number(int number) {
        this.value = number;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
