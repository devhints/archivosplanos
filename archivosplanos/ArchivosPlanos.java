package archivosplanos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArchivosPlanos {

	public static void leerArchivo(String archivo) throws IOException {
		
		String valor;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		
		while((valor = b.readLine()) != null) {
			
			System.out.println(valor);
			
		}
		
		b.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		leerArchivo("archivosplanos/archivo_plano.txt");

	}

}
