package com.pteixeira.heranca_polimorfismo.taxpayer;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {

    }

    public  Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double basicTax = (getAnualIncome() < 20000) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;

        basicTax -= getHealthExpenditures() * 0.5;

        if (basicTax < 0) {
            basicTax = 0.0;
        }
        return basicTax;
    }

}
