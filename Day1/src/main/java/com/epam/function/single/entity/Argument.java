package com.epam.function.single.entity;

public class Argument {
    private double value;

    public Argument(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Argument{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
