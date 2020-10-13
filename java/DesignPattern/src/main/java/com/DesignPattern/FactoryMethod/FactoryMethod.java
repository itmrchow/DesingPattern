package com.DesignPattern.FactoryMethod;

//https://ithelp.ithome.com.tw/articles/10202075
//FactoryMethod 工廠模式
//工廠方法模式( Factory Method )，定義一個用於建立物品的介面，讓子類決定實體化哪一個類別。工廠方法使一個類別的實例化延遲到其子類別。


public class FactoryMethod {
    Factory frenchFriesFactory = new FrenchFriesFactory();
    Product fries = frenchFriesFactory.getProduct();
    Product myFries = ((FrenchFriesFactory)frenchFriesFactory).getProduct("去鹽");
}
