package org.example.secondLab.components;

/**
 * Класс, представляющий жесткий диск компьютера.
 */
public class HardDrive implements ComputerComponent {
    private int capacityGB;

    /**
     * Конструктор для создания объекта жесткого диска с указанным объемом.
     *
     * @param capacityGB Объем жесткого диска в гигабайтах (GB).
     */
    public HardDrive(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    /**
     * Конструктор для создания объекта жесткого диска с нулевым объемом (по умолчанию).
     */
    public HardDrive() {
        this.capacityGB = 0;
    }

    /**
     * Получает информацию о жестком диске в виде строки.
     *
     * @return Строка с информацией о жестком диске, включая его объем.
     */
    @Override
    public String getInfo() {
        return "Hard disk volume: " + capacityGB + " GB";
    }

    /**
     * Устанавливает объем жесткого диска.
     *
     * @param capacityGB Новый объем жесткого диска в гигабайтах (GB).
     */
    public void setCapacityGB(int capacityGB) {
        this.capacityGB = capacityGB;
    }
}
