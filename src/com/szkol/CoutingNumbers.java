package com.szkol;

public class CoutingNumbers {
    private Integer number;

    @Override
    public String toString() {
        return "CoutingNumbers{" +
                "number=" + number +
                '}';
    }

    public CoutingNumbers(Integer number) {
        this.number = number;
    }
    public int userOutput(){
        if (coutingNumberFromUser() > 9) {
            number = coutingNumberFromUser();
            coutingNumberFromUser();
        }
        return coutingNumberFromUser();

    }

    private int coutingNumberFromUser() {
        String numbConvert = String.valueOf(number);
        int last_value = (String.valueOf(numbConvert).length() - 1);
        int count = 0;
        for (int i = 0; i <= last_value; i++) {
            count += Integer.parseInt(String.valueOf(numbConvert.charAt(i)));
        }
        return count;
    }
}