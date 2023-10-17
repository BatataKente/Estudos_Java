package exercices.youtube.string_buffer_and_builder;

public class StringBufferAndBuilder {
	public static void main(String arguments[]) {
		StringBuffer stringBuffer = new StringBuffer("Josicleison");
//		System.out.println(stringBuffer.capacity());//27
//		System.out.println(stringBuffer.length());//11
//		stringBuffer.append(", Lero lero.");
//		System.out.println(stringBuffer);//Josicleison, Lero lero.
//		String phrase = stringBuffer.toString();
//		System.out.println(phrase); //Josicleison
//		stringBuffer.insert(2, "babadu");
//		System.out.println(stringBuffer); //Jobabadusicleison
//		stringBuffer.deleteCharAt(2);
//		System.out.println(stringBuffer);//Joicleison
//		stringBuffer.delete(2, 4);
//		System.out.println(stringBuffer);//Jocleison
//		stringBuffer.setLength(15);
//		System.out.println(stringBuffer);//Josicleison####
//		stringBuffer.setLength(9);
//		System.out.println(stringBuffer);//Josicleis
//		stringBuffer.ensureCapacity(100);
//		System.out.println(stringBuffer.capacity());//100
//		stringBuffer.ensureCapacity(-10);
//		System.out.println(stringBuffer.capacity());//27
//		stringBuffer.ensureCapacity(1);
//		System.out.println(stringBuffer.capacity());//27
		stringBuffer.setLength(15);
		System.out.println(stringBuffer);//Josicleison####
		System.out.println(stringBuffer.length());//15
	}
}
