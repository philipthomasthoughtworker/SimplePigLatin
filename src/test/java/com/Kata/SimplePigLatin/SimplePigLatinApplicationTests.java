package com.Kata.SimplePigLatin;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplePigLatinApplicationTests {

	@Test
	public void FixedTests() {
		assertEquals("igPay atinlay siay oolcay", SimplePigLatinApplication.pigIt("Pig latin is cool"));
		assertEquals("hisTay siay ymay tringsay", SimplePigLatinApplication.pigIt("This is my string"));
	}

}
