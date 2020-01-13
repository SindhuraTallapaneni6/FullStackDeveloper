package com.cts.day10;

public class ExceptionDemo4 {
	public static boolean isValidUser(String user) throws InvalidUser{
		if(!user.equals("admin")) {
			throw new InvalidUser("invalid");
		}
		return true;
		
	}
	public static void main(String args[]) {
		try {
			isValidUser("sindhu");
			
		}
		catch(InvalidUser ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}

}
class InvalidUser extends Exception{
	public void InvalidUser() {
		
	}
	InvalidUser(String message){
		System.out.println("Invalid User");
	}
	public String getMessage() {
		return "invaliduser";
	}
}

 