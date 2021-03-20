public class Correcto {
    
    public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
