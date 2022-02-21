package org.student;

public class PC extends Laptop {
public void getSystemInfo() {
	System.out.println("MAC");
}
public static void main(String[] args) {
	PC pc=new PC();
	pc.getSystemInfo();
}
}
