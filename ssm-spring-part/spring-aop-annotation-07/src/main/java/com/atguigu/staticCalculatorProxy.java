package com.atguigu;

public class staticCalculatorProxy implements Calculator{

    private Calculator calculator;

    public staticCalculatorProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("i = " + i + ", j = " + j);
        int res = calculator.add(i,j);
        System.out.println("res = " + res);
        return res;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
