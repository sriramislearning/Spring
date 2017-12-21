/**
 * 
 */
package com.sriramislearning.spring.service.SayGreeting;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SriramSrinivasan
 *
 */
@RestController
public class SayGreetingController {

	private static final String template = "Wish You A Happy New Year %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public SayGreeting greeting(@RequestParam(value="name")String name) {
		
		return new SayGreeting(counter.incrementAndGet(), String.format(template, name));
		
	}
}
