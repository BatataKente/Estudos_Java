package cursos.alura._8_java_brasil.cep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class Cep {
	public static void main(String[] args) {
//		ViaCEPClient cliente = new ViaCEPClient();
//		try {
//			ViaCEPEndereco endereco = cliente.getEndereco("82010340");
//			System.out.println(endereco.getLogradouro());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			URL url = new URL("http://viacep.com.br/ws/01001000/xml/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
