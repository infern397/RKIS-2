package org.example.secondLab.components;

/**
 * Класс, представляющий центральный процессор (CPU) компьютера.
 */
public class CentralProcessingUnit implements ComputerComponent {
    private double frequencyGHz;

    /**
     * Конструктор для создания объекта CPU с указанной частотой.
     *
     * @param frequencyGHz Частота процессора в гигагерцах (GHz).
     */
    public CentralProcessingUnit(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }

    /**
     * Конструктор для создания объекта CPU с нулевой частотой (по умолчанию).
     */
    public CentralProcessingUnit() {
        this.frequencyGHz = 0.0;
    }

    /**
     * Получает информацию о процессоре в виде строки.
     *
     * @return Строка с информацией о процессоре, включая частоту.
     */
    @Override
    public String getInfo() {
        return "Processor with frequency: " + frequencyGHz + " GHz";
    }

    /**
     * Устанавливает частоту процессора.
     *
     * @param frequencyGHz Новая частота процессора в гигагерцах (GHz).
     */
    public void setFrequencyGHz(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }
}
