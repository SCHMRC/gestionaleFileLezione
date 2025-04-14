package it.marcoschiavo.gestionefilelezione;

import java.io.File;
import java.io.FileWriter;
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
		
		//TODO: scrittura del file
		//apro lo stream del file in scrittura
		FileWriter fw = new FileWriter(file);
		//scrivo una riga del file, ma il file vine scritto lettera per lettera
		fw.write("Hello World!\n");
		fw.write("Ciao Mondo");
		//chiudo SEMPRE lo stream in scrittura.
		fw.close();
		//TODO: lettura del file
	}

}
