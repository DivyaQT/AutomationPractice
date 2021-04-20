package com.Test.csv_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class CSVHelper {

	 private static String target = "src/test/resource/dataSources/testData.csv";
	 private static HashMap<String, String> data;
	
	/********************************************************************
	 * Description: Iterates through a CSV file and populates hash map
	 ********************************************************************/
	 @SuppressWarnings("resource")
	 public static void loadCSV(){
		data = new HashMap<String, String>();
		String line;
		String [] split;

		try {
			BufferedReader br = new BufferedReader(new FileReader(target));
			while ((line = br.readLine()) != null) {
				split = line.split(",");
				String key = split[0];
				String value = split[1];
				data.put(key,value);
				}
			}
			catch (Exception e) {
				System.out.println("Exception Found");
				e.printStackTrace();
			}	
		}

	/********************************************************************
	 * Description: Generates data hash map to provide the Value of the Key
	 ********************************************************************/
	 public static String getKey(String key){
		loadCSV();
		return data.get(key);
	 }
	 
	/********************************************************************
	 * Description: Returns SignIn Email
	 ********************************************************************/
	 public static String getSignInEmail(){
		return getKey("signInEmail");
	 }
	 
	/********************************************************************
	 * Description: Returns SignIn Password
	 ********************************************************************/
	 public static String getSignInPassword(){
		return getKey("signInPassword");
	 }
	 
	/********************************************************************
	 * Description: Returns FirstName to be updated
	 ********************************************************************/	
	 public static String getFirstName(){
		return getKey("updateFirstName");
	 }
	 
	/********************************************************************
	 * Description: Returns Current Password value
	 ********************************************************************/
	 public static String getCurrentPassword(){
		return getKey("currentPassword");
	 }
	 
	/********************************************************************
	 * Description: Returns New Password value
	 ********************************************************************/	 
	 public static String getNewPassword(){
		return getKey("newPassword");
	 }
	 
	/********************************************************************
	 * Description: Returns Confirm Password value
	 ********************************************************************/
	 public static String getConfirmPassword(){
		return getKey("confirmPassword");
	 }
}
