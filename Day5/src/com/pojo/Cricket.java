package com.pojo;

public class Cricket {
	public boolean validateAge(int age)throws UserDefinedException{
	if(age>=18 && age<=40)
	{
		return true;
	}
	else
	{
		throw new UserDefinedException("customise the error message");
	}
}
}
