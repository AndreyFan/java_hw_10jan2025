package de.telran.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {
//  Добавьте вывод логов (пока в консоль) для всех методов контроллеров, в которых для каждого метода будет
//выводиться следующая информация:
//
//время старта метода, имя метода, значения параметров, которые передаются в метод
//
//время окончания работы метода, значение возвращаемого результата и время работы метода
//Попробуйте реализовать эту функциональность с использованием Spring AOP.

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
