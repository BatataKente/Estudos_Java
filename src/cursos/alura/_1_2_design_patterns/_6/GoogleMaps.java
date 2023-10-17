package cursos.alura._1_2_design_patterns._6;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Map {

	@Override
	public String getMap(String rua) {
		URL url;
		try {
			final String googleMaps = "http://maps.google.com.br/maps?q=" + String.join("+", rua.split(" "));
			url = new URL(googleMaps);
			final InputStream openStream = url.openStream();
			return "lero lero";
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
