package com.Kata.SimplePigLatin;

import java.util.StringJoiner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplePigLatinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplePigLatinApplication.class, args);
	}

	public static String pigIt(String str) {

		StringJoiner joiner = new StringJoiner(" ");

		for (String word : str.split(" ")) {
			StringBuilder builder = new StringBuilder();

			String firstLetter = word.substring(0, 1);

			if (Character.isLetter(firstLetter.charAt(0))) {
				builder.append(word.subSequence(1, word.length()));
				builder.append(firstLetter);
				builder.append("ay");

				joiner.add(builder.toString());
			} else
				joiner.add(firstLetter);
		}

		return joiner.toString();

	}

	// public static String pigIt(String str) {
	// return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
	// }
}
