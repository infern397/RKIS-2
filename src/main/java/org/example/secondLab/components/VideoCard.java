package org.example.secondLab.components;

/**
 * Класс, представляющий видеокарту компьютера.
 */
public class VideoCard implements ComputerComponent {
    private String model;

    /**
     * Конструктор для создания объекта видеокарты с указанной моделью.
     *
     * @param model Модель видеокарты.
     */
    public VideoCard(String model) {
        this.model = model;
    }

    /**
     * Конструктор для создания объекта видеокарты с моделью "Default" (по умолчанию).
     */
    public VideoCard() {
        this.model = "Default";
    }

    /**
     * Получает информацию о видеокарте в виде строки.
     *
     * @return Строка с информацией о видеокарте, включая ее модель.
     */
    @Override
    public String getInfo() {
        return "Video card model: " + model;
    }

    /**
     * Устанавливает модель видеокарты.
     *
     * @param model Новая модель видеокарты.
     */
    public void setModel(String model) {
        this.model = model;
    }
}
