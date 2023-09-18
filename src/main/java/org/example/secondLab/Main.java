package org.example.secondLab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Главный класс приложения, который инициализирует Spring контекст и использует компонент "Computer".
 */
public class Main {
    /**
     * Основной метод приложения.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.getSystemInfo());

        context.close();
    }
}
