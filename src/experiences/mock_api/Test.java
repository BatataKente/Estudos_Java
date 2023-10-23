package experiences.mock_api;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
	public static void main(String[] args) {
			final Network network = new Network("https://62baed237bdbe01d52938975.mockapi.io/api");
//			
			Post[] posts = network.get("/FakeBookPosts", Post[].class);
			
//			System.out.println(new Gson().toJson(posts));
			
			
            System.out.println(posts[0].getName());
            System.out.println(posts[0].getLikes());
            System.out.println(posts.length);
		
//			network.put("/FakeBookPosts/11", new Post("lero lero", "lero lero", "lero lero", "lero lero", 0, 0, "11"));
//			network.delete("/FakeBookPosts", 11);
	}
}
