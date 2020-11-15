package com.epam.function.single.entity;

public class Function {
    private double value;
    private double arg;

    public Function(double value, double arg) {
        this.value = value;
        this.arg = arg;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getArg() {
        return this.arg;
    }

    public void setArg(double arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Function{");
        sb.append("value=").append(value);
        sb.append(", arg=").append(arg);
        sb.append('}');
        return sb.toString();
    }
}
