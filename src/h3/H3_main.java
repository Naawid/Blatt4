package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat, fahrenheitFloat;
		double celsiusDouble, fahrenheitDouble;
		celsiusFloat = 14.2F;
		fahrenheitFloat = 4F;
		celsiusDouble = 14.2D;
		fahrenheitDouble = 4D;
		
		fahrenheitFloat = (celsiusFloat * 9/5) + 32;
		
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
	}
}
