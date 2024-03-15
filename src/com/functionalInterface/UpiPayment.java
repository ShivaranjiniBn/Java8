package com.functionalInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UpiPayment {
	
	String doPayment(String source,String dest);
	
	default double getScratchCard() {
		return new Random().nextDouble();
	}
	
	static String dataPatterns(String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		return dateFormat.format(new Date());
	}

}
