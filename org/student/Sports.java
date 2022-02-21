package org.student;

import java.security.PublicKey;

public class Sports {
public void Achiever(String name, int medalcount) {
	System.out.println("Name"+" = "+name+"    "+"Medals"+" = "+medalcount);
}
public void Achiever(String country, String sportName, int rank) {
	System.out.println("Country"+" = "+country+" "+"Name"+" = "+sportName+" "+"Rank"+" = "+rank);
}
public void Achiever(float weight, int height, long contactNo) {
	System.out.println("Weight"+" = "+weight+" "+"Height"+" = "+height+" "+"Contactno"+" = "+contactNo);
}
public void Achiever(String tournamentName, long prizeMoney) {
	System.out.println("Tournamentname"+" = "+tournamentName+" "+"Prizemoney"+" = "+prizeMoney);
}
public static void main(String[] args) {
	Sports sport=new Sports();
	sport.Achiever("Messi", 23);
	sport.Achiever("Argentina", "Foot ball", 2);
	sport.Achiever(68, 163, 1234567890l);
	sport.Achiever("Fifa world cup", 1000000);
	
}
}
