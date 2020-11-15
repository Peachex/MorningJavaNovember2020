package com.epam.number.excellent.entity;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
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
