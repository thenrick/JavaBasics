
public class Examples {

	public static void main(String[] args) {
		
		//The byte is an 8-bit integer with a minimum value of -128 and the maximum value of 127. So overall its use is limited since of this small range.
		byte smPrimitveByte = 1;
		//This is a simple declaration of a byte called "smPrimitveByte" and we are setting its value at 1. Its default value is 0.
		System.out.println(smPrimitveByte);
		
		//The short is a 16-bit integer with a minimum value of -32,768 and the maximum value of 32,767. Short is much more useful as it has a larger range than a byte.
		short aShort4u = 1011;
		//This is a simple declaration of a short called "aShort4u" and we are setting its value at 1011. Its default value is 0.
		System.out.println(aShort4u);
		
		//The int is a 32-bit integer with a minimum value of -2<sup>31</sup> and the maximum value of -2<sup>31</sup>-1. Int is widely used unless you have memory restrictions it is best just to use int in these cases.
		int myInt = 24601;
		//This is a declaration of an int called "myInt" and we are setting its value at 24601. Its default value is 0.
		System.out.println(aShort4u);
		
		//The long is a 64-bit integer with a minimum value of -2<sup>63</sup> and the maximum value of -2<sup>63</sup>-1. Long gives you a larger range of values than the int. So if that is needed to use the long data type.
		long thatLong = 12345678910L;
		//This is a declaration of a long called "thatLong" and we are setting its value at 12345678910. Note to properly declare the long you need the "L" on the end(lowercase l works too). Its default value is 0L.
		System.out.println(thatLong);
		
		//The float is a 32-bit floating point number. Similar to the byte and short with integers, the float can be used when memory is at a premium for floating point numbers.
		float hopeFloats = 1234.56f;
		//This is a declaration of a float called "hopeFloats" and we are setting its value at 1234.56. Note to properly declare the float you need the "F" on the end(lowercase f works too). Its default value is 0.0f.
		System.out.println(hopeFloats);
		
		//The double is a 64-bit floating point number. Similar to the int for integers, the double is more often used for floating point numbers.
		double doubleStuff = 17455677.4234d;
		//This is a declaration of a double called "doubleStuff" and we are setting its value at 17455677.4234. Doubles can be declared with "D" on the end(lowercase D works too) <u>but this is not required.</u> Its default value is 0.0d.
		System.out.println(doubleStuff);
		
		//The boolean is a data type with two possible values. It can be either true or false nothing else. This type is used extensively for program flow logic.
		boolean isTaxable = false;
		//This is a declaration of a boolean called "isTaxable" and we are setting its value to false. The default value of boolean is false.
		System.out.println(isTaxable);
		
		//The char is a data type of a single Unicode character. Char is used in special situations where we use String more often(more on that later).
		char tomChar = 'T';
		//This is a declaration of a char called "tomChar" and we are setting its value to 'T'. The default value of char is '\u0000'.
		System.out.println(tomChar);
	}

}
