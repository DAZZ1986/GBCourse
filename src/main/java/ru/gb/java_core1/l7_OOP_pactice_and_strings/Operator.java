package ru.gb.java_core1.l7_OOP_pactice_and_strings;

public enum Operator {
    SUM {
        public int operation(int a, int b) {
            return a + b;
        }
    },
    MUL {
        public int operation(int a, int b) {
            return a * b;
        }
    };

    public abstract int operation(int a, int b);
}
