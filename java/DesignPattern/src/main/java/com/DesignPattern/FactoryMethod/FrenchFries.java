package com.DesignPattern.FactoryMethod;

//薯條
public class FrenchFries implements Product {// 實作商品介面

    // 預設有鹽巴
    String state = "有鹽巴";

    protected FrenchFries() {

    }

    protected FrenchFries(String status) {
        this.state = status;

    }

    @Override
    public void describe() {
        System.out.println("我是" + state + "薯條");

    }

}
