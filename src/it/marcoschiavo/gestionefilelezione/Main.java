package it.marcoschiavo.gestionefilelezione;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//creo un oggetto di tipo file, NON crea il file fisico nel FileSystem
		File file = new File("./prova.txt");
		//controllo che il file non esista
		if(!file.exists()) {
			//se non esiste lo creo
			file.createNewFile();
		}

	}

}
