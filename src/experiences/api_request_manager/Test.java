package experiences.api_request_manager;

import java.util.Arrays;

import com.github.djunqueirao.RequestManager;
import com.github.djunqueirao.RequestResponse;

import experiences.api_request_manager.cban.DadosCliente;

public class Test {
	
	public static void main(String[] args) {
			final RequestManager apiRequestManager = new RequestManager("http://localhost:8081");
			final RequestResponse<DadosCliente[]> response = apiRequestManager.get("/cliente", DadosCliente[].class);
			System.out.println(response.getCode());
			System.out.println(response.getBody());
			System.out.println(Arrays.asList(response.getData()));
			System.out.println(response.getMessage());
	}
}
