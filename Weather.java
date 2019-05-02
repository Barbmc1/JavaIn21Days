package JavaIn21Days;

public class Weather {

	public static void main(String[] args) {
		float fah = 86;
		System.out.println(fah + " degrees Farenheit is ...");
		//To convert Farrenheit into Celsius
		//begin by subtracting 32;
		fah = fah - 32;
		//Divide the answer by 9
		fah = fah /9;
		//Multiply that answer by 5
		fah = fah * 5;
		System.out.println(fah + " degrees Celsius\n");
		
		float cel = 33;
		System.out.println(cel + " degrees in Celsius is...");
		//To convert Celcius to Farhenheit
		//begin by multiplying by 9
		cel = cel * 9;
		//Devide the answer by 5
		cel = cel / 5;
		//Add 32 to the answer
		cel = cel + 32;
		System.out.println(cel + " degrees Fahrenheit");
		

	}

}
