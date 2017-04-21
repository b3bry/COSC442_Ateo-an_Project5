package project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {
	public Boolean bondRegex(String input){
		String bondPattern = "((\\d)|(\\()|(\\)))*(\\()+((\\d)|(\\()|(\\)))*(007)((\\d)|(\\()|(\\)))*(\\))+((\\d)|(\\()|(\\)))*";
		Pattern p = Pattern.compile(bondPattern);
		Matcher m = p.matcher(input);
		
		return m.find();
	}
}
