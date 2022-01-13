package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The size is 25inces");
	}

	public static void main(String[] args) {
		
		Desktop dd = new Desktop();
		
	     dd.computerModel("1234567");
		 dd.desktopSize();
	}

}
