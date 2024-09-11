package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        app.DataProvider dataProvider = new app.DataProvider(); // Створюємо об'єкт DataProvider
        app.Corrector corrector = new app.Corrector(); // Створюємо об'єкт Corrector
        String output = corrector.handleData(dataProvider.getData()); // Використовуємо метод getData()
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}