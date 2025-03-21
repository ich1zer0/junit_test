package org.example;

public class Check {
    private String unuse = "unuse";

        public String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.evenOrOdd(2));
    }
}
