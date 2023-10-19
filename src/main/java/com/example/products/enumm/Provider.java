package com.example.products.enumm;

public enum Provider {
    Магнит_Косметик("Магнит Косметик"),
    Лента("Лента"),
    Пятерочка("Пятерочка"),
    Батькин_Резерв("Батькин Резерв");

    private final String displayValue;

    Provider(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
