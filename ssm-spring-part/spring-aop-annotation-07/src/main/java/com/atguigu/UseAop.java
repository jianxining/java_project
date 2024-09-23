package com.atguigu;

public class UseAop {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorPureImpl();
        Calculator staticCalculatorProxy = new staticCalculatorProxy(calculator);

        int add = staticCalculatorProxy.add(1, 2);
        System.out.println("add = " + add);

    }
}
