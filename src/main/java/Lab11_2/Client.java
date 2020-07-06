package Lab11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Use the Interpreter Pattern to interpret/evaluate prefix expressions like
 * what we see below: "- + 10 5 - 8 2";
 *
 */
public class Client {
	public static void main(String[] args) {
		final String input = "- + 10 5 - 8 2";
		List<String> tokenList = new ArrayList<String>(Arrays.asList(input.split(" ")));
		Parser tokenReader = new Parser();
		Expression expression = tokenReader.parse(tokenList);
		System.out.println("The result of input =>  "+input+" equals: "+expression.interpret());
	}
}
