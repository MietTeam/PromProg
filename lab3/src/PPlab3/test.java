package PPlab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	static List<String> lines;
	public static void main(String[] args) {
		
		
	}
	public static boolean checkWithRegExpName(String testString){
		Pattern name = Pattern.compile("^[À-ß]{1}[à-ÿ]{3,15}$");
		
		Matcher match = name.matcher(testString);
		while(match.find()) {
            System.out.println(testString.substring(match.start(), match.end()));
        }
		return match.matches();
		}
	
	public static boolean checkWithRegExpPhone(String testString){		
		Pattern phone = Pattern.compile("^[+]{0,1}[- (),0-9]{7,}$");
		Matcher match = phone.matcher(testString);
		while(match.find()) {
            System.out.println(testString.substring(match.start(), match.end()));
        }
		return match.matches();
		}
	public static boolean checkWithRegExpEmail(String testString){		
		Pattern phone = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher match = phone.matcher(testString);
		while(match.find()) {
            System.out.println(testString.substring(match.start(), match.end()));
        }
		return match.matches();
		}

}
