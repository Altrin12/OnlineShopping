package com.restapi;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonValidation {
	public static void main(String[] args) throws Throwable {

		File f = new File ("C:\\Users\\altri\\eclipse-workspace\\Maven_Projects\\src\\test\\java\\com\\restapi\\PayLoaddd.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(reader);
		JSONObject jsonObj = (JSONObject)obj;
		System.out.println(jsonObj.get("name").toString());
	}
}	
