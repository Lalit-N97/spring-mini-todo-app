/*
 * created by Lalit Negi
 * MUST DO - 
 *  0. JPA project is MUST ++
 *  1. sending accurate response using ResponseEntity<> ++
 *  2. implement Exception handling (customize error messages' standard) ++
 *  3. API documentation using swagger. ++
 *  4. content negotiation by adding jackson-dataformat-xml dependency
 *  5. Authentication  and authorization using Spring Security
 *  6. Bean validations ++
 *  7. use logs using slf4j ++
 * */

package com.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMiniTodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMiniTodoAppApplication.class, args);
	}

}
