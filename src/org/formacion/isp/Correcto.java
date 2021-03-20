package org.formacion.isp;

import java.util.ArrayList;
import java.util.List;

public class Correcto extends ProcesadorTexto implements verificadorIdioma{
	private List<String> texto = new ArrayList<>();
	
    @Override

	public boolean correcto (Idioma idioma) {
		return texto.stream()
                    .noneMatch(n -> idioma.diccionario.contains(n.toLowerCase()));
		
}
}
