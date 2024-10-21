package view;

import model.IODevice;
import model.MultiFunctionalPrinter;

public class Main {
	
	public static void main(String[] args) {
		String content = "Conteúdo para operação de I/O";
		IODevice device = new MultiFunctionalPrinter();

		// Experimente os outros tipo de IODevice
		//device = new Fax();
		//device = new StandardPrinter();
		
		device.faxDocument(content);
		device.printDocument(content);
		device.scanDocument(content);
		device.xeroxDocument(content);
	}
}
