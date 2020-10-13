package com.DesignPattern.FactoryMethod;

public class FrenchFriesFactory implements Factory {

    @Override
    public Product getProduct() {
        return new FrenchFries();
    }

    public Product getProduct(String status) {
        return new FrenchFries(status);
    }

}
