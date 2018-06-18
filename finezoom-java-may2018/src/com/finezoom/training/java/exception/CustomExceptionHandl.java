package com.finezoom.training.java.exception;



public class CustomExceptionHandl {

	public static void validate(int age) throws JavaTrainingExcep{
		if(age>10)throw new JavaTrainingExcep("Age is error");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(50);
		} catch (JavaTrainingExcep e) {
			// TODO: handle exception
			//System.out.println("Not");
			e.printStackTrace();
		}
		finally{
			System.out.println("Complete");
		}
	}

}
