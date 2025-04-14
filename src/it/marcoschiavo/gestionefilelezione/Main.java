package it.marcoschiavo.gestionefilelezione;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

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
		//al posto di utilizzare file writer utilizzerò il buffer
		bw.write("Hello World!");
		bw.newLine();
		bw.write("Ciao Mondo!");
		//devo chiudere prima il buffer e poi lo stream in scrittura.
		bw.close();
		fw.close();
		//TODO: lettura del file
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		//utilizzo il metodo read di un oggetto istanza di BufferedReader
		String rigo = br.readLine();
		while(rigo!= null) {
			System.out.println(rigo);
			rigo = br.readLine();
		}
		//chiudo lo stream in lettura
		br.close();
		fr.close();
		//TODO:modifica di un file
		//apro il file in lettura
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		//Leggo il contenuto del file e modifico in memoria
		Vector<String> struttura = new Vector<>();
 		String linea;
		while((linea = br.readLine()) != null) {
			linea = linea.replace("Hello", "xxxx");
			struttura.add(linea);
		}
		br.close();
		fr.close();
		//apro il file in scrittura
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		//sovrascrivo il contenuto del file con il contenuto modificato
		for(String temp : struttura) {
			bw.write(temp);
			bw.newLine();
		}
		bw.close();
		fw.close();
		
		
		
	}

}
