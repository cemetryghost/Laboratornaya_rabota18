package com.company;

import java.util.Scanner;

class Expression {
    private static Expression expression = new Expression();
    private double x, y;
    private Expression(){
    }

    public static Expression getInstance(){
        return expression;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double Example(){
        return (2 * x) + (3 / y);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Expression expression = Expression.getInstance();
        System.out.print("Введите X: ");
        double x = in.nextDouble();
        System.out.print("Введите Y: ");
        double y = in.nextDouble();
        expression.setX(x);
        expression.setY(y);
        System.out.printf("Результат: %s\n", expression.Example());

        Expression expression1 = Expression.getInstance(); // при создании второго объекта - получаем ссылку на первый
        System.out.println(expression1.getX());
        System.out.println(expression1.getY());
    }
}
