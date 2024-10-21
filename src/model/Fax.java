package model;

public class Fax implements IODevice {

	@Override
	public void faxDocument(String content) {
		System.out.println("FX: Enviando documento: \n" + content);
	}

	@Override
	public void printDocument(String content) {
		// Fax não suporta impressão
		throw new UnsupportedOperationException("FX: Impressão não suportada.");
	}

	@Override
	public void scanDocument(String content) {
		// Fax não suporta digitalização
		throw new UnsupportedOperationException("FX: Digitalização não suportada.");
	}

	@Override
	public void xeroxDocument(String content) {
		// Fax não suporta xerox
		throw new UnsupportedOperationException("FX: Xerox não suportado.");
	}

}
