package com.epam.function.single.entity;

public class MathFunction {
    private double value;

    public MathFunction(double value) {
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
        final StringBuilder sb = new StringBuilder("Function{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
