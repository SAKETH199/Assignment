package service;

public class Operations {
	public float a;
	public float b;
	public float c;
	public float d;
	public float e;
	public float f;
	public float g;
	public float h;
	public float i;
	 public float operationA(float a,float b,float c)
	 {
		 return -a+b*c;
	 }
	 public float operationB(float d, float e)
	 {
		 return (d+e)%e;
	 }
	 public float operationC(float a,float b,float f,float g)
	 {
		 return f+-g*a/b;
	 }
	 public float operationD(float a,float b,float g,float h,float i)
	 {
		 return a+h/g*i-b%g;
	 }

}
