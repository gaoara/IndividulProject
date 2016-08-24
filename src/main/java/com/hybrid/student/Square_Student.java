package com.hybrid.student;

public class Square_Student {
	
	public static String name;
	double score;
	int correct;
	int incorrect;
	
	public Square_Student(String name, double score, int correct ,int incorrect) {
		Square_Student.name = name;
		this.score = score;
		this.correct = correct;
		this.incorrect = incorrect;
	}
	
	
	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public int getIncorrect() {
		return incorrect;
	}

	public void setIncorrect(int incorrect) {
		this.incorrect = incorrect;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	

}
