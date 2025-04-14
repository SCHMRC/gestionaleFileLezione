package it.marcoschiavo.gestionefilelezione;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
		BufferedWriter bw = new BufferedWriter(fw);
		//al posto di utilizzare file wreter utilizzerò il buffer
		bw.write("Hello World!");
		bw.newLine();
		bw.write("Ciao Mondo!");
		//devo chiudere prima il buffer e poi lo stream in scrittura.
		bw.close();
		fw.close();
		//TODO: lettura del file
		FileReader fr = new FileReader(file);
		//utilizzo il metodo read di un oggetto istanza di FileReader
		System.out.println(fr.read());
		//chiudo lo stream in lettura
		fr.close();
		
	}

}
