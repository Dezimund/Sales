package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    private double taxRate = 0.09;
    // Налоговоу ставку объявите в виде константы
    // здесь ...


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double taxIncome(double income) {
        return income * taxRate;
    }

    @Override
    public double income(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double income(double income, double taxIncome) {
        return income - taxIncome;
    }

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...


    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...


    // Расчёт суммы налога с продаж.
    // здесь ...

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
}
