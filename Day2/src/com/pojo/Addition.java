package com.pojo;

public class Addition {
	private int sum=0;
	private int i=0;
	private int j=0;
	private int arraySize;
	public void displayAddition(int numbers[])
	{
		arraySize=numbers.length;
		while(j<arraySize)
		{
			j=j+1;
			if(j>1)
			{
				for(int k=i;k<j;k++)
				{
					sum=sum+numbers[k];
					if(k!=j-1)
					{
						System.out.print(numbers[k] + "+");
					}
					else
					{
						System.out.print(numbers[k]);
					}
				}
				System.out.println("="+sum);
				sum=0;
			}
						}
	}

	}
