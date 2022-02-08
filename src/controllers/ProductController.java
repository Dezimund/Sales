package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        double income = Rounder.rounder(model.income(model.getQuantity(),model.getPrice()));
        double taxIncome = Rounder.rounder(model.taxIncome(income));
        double clearIncome = Rounder.rounder(model.income(income,taxIncome));

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        String output = "Имя товара : " + name +
                "  Доход грязными : " + income +
                "  Налог : " + taxIncome +
                "  Доход чистыми : " + clearIncome;

        view.getOutput(output);
    }
}
