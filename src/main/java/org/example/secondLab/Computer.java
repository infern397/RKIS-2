package org.example.secondLab;

import org.example.secondLab.components.ComputerComponent;

/**
 * Класс, представляющий персональный компьютер.
 */
public class Computer {
    private final ComputerComponent videoCard;
    private final ComputerComponent cpu;
    private final ComputerComponent hardDrive;

    /**
     * Конструктор для инициализации компонента компьютера.
     *
     * @param videoCard Компонент видеокарты.
     * @param cpu       Компонент процессора.
     * @param hardDrive Компонент жесткого диска.
     */
    public Computer(ComputerComponent videoCard, ComputerComponent cpu, ComputerComponent hardDrive) {
        this.videoCard = videoCard;
        this.cpu = cpu;
        this.hardDrive = hardDrive;
    }

    /**
     * Получение информации о компьютере в виде строки.
     *
     * @return Строка с информацией о компьютере.
     */
    public String getSystemInfo() {
        return "Personal computer with:\n" + cpu.getInfo() + "\n" + hardDrive.getInfo() + "\n" + videoCard.getInfo();
    }
}
