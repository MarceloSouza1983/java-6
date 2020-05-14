package challenge;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {

		if (texto.toString().isEmpty()) throw new IllegalArgumentException();
		if (texto.toString().equals(null)) throw new NullPointerException();
		try {

			texto = texto.toLowerCase(); // Converte o texto para minúsculo
			System.out.println("Método criptografar (texto) = " + texto);

			char[] textoArray = texto.toCharArray(); // Converte String em array
			texto = ""; // Seta texto para vazio

			char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Converte alfabeto em array

			for (int i = 0; i < textoArray.length; i++) { // Percorre palavra

				for (int j = 0; j < alfabeto.length; j++) { // Percorre alfabeto

					if (alfabeto[j] == textoArray[i]) { // Compara letra atual da palavra com a atual do texto

						if (j + 3 >= 26) {
							textoArray[i] = alfabeto[(j + 3) - 26]; // Realiza troca de letra
						}

						else {
							// Pegar código da letra se for igual a número manter, caso contrário trocar
							textoArray[i] = alfabeto[j + 3];
						}

						j = 0; // reinicia alfabeto
						break;
					}

				}

				texto += textoArray[i]; // Concatena letra para retornar valor
			}

			System.out.println("Método criptografar (texto) = " + texto + "\n");
			return texto;

		} catch (Exception e) {
			throw new UnsupportedOperationException("esse metodo nao esta implementado ainda");
		}

	}


	@Override
	public String descriptografar(String texto) {
		if(texto.toString().isEmpty())
			throw new IllegalArgumentException();
		if(texto.toString().equals(null))
			throw new NullPointerException();
		try {

			texto = texto.toLowerCase(); // Converte o texto para minúsculo
			System.out.println("Método descriptografar (texto) = " + texto);

			char[] textoArray = texto.toCharArray(); // Converte String em array
			texto = ""; // Seta texto para vazio

			//String textoCriptografado = "";
			char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Converte alfabeto em array

			for (int i = 0; i < textoArray.length; i++) { // Percorre palavra

				for (int j = 0; j < alfabeto.length; j++) { // Percorre alfabeto

					if (alfabeto[j] == textoArray[i]) { // Compara letra atual da palavra com a atual do texto

						if (j - 3 >= 26) {
							textoArray[i] = alfabeto[(j - 3) + 26]; // Realiza troca de letra
						}

						else {
							// Pegar código da letra se for igual a número manter, caso contrário trocar
							textoArray[i] = alfabeto[j - 3];
						}

						j = 0; // reinicia alfabeto
						break;
					}

				}

				texto += textoArray[i]; // concatena letra para retornar valor
			}

			System.out.println("Método descriptografar (texto) = " + texto + "\n");
			return texto;

		} catch (Exception e) {
			throw new UnsupportedOperationException("esse metodo nao esta implementado ainda");
		}

	}

}