package experiences.mock_api;

public class Test {
	public static void main(String[] args) {
			final ApiRequestManager apiRequestManager = new ApiRequestManager("https://62baed237bdbe01d52938975.mockapi.io/api");
			
			final Post[] numberOfPosts = apiRequestManager.get("/FakeBookPosts", Post[].class);
			
	            System.out.println(numberOfPosts[0].getLikes());
			
//            System.out.println(apiRequestManager.put("/FakeBookPosts/9", new Post("lero lero2", "lero lero2", "lero lero2", "lero lero2", 0, 0, null)));
//          System.out.println(apiRequestManager.post("/FakeBookPosts", new Post("lero lero", "lero lero", "lero lero", "lero lero", 0, 0, null)));
	}
}
