package app;

public class Corrector {

    // ANSI код для оранжевого кольору
    private static final String ORANGE_COLOR = "\u001B[38;5;214m"; // Змінюємо колір на оранжевий
    private static final String RESET_COLOR = "\u001B[0m"; // Скидаємо колір

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1; // Починаємо з 1 для правильного нумерування
        for (String str : strs) {
            // Корекція слів
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            // Зміна кольору для слова "orange"
            if (str.equals("orange")) {
                str = ORANGE_COLOR + str + RESET_COLOR; // Додаємо колір
            }
            // Додаємо відформатоване слово до результату
            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++; // Збільшуємо лічильник
        }
        return stringBuilder.toString();
    }
}