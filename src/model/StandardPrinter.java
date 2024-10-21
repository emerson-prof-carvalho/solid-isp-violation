package model;

public class StandardPrinter implements IODevice {

	@Override
	public void faxDocument(String content) {
		// Impressora não suporta envio de fax
		throw new UnsupportedOperationException("SP: Envio de fax não suportado.");
	}

	@Override
	public void printDocument(String content) {
		System.out.println("SP: Imprimindo documento: \n" + content);
	}

	@Override
	public void scanDocument(String content) {
		// Impressora não suporta digitalização
		throw new UnsupportedOperationException("SP: Digitalização não suportada.");
	}

	@Override
	public void xeroxDocument(String content) {
		// Impressora não suporta xerox
		throw new UnsupportedOperationException("SP: Xerox não suportado.");
	}
}
