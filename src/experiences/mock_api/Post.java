package experiences.mock_api;

public class Post {
	private final String perfilImage;
	private final String image;
	private final String name;
	private final String description;
	private final int likes;
	private final int shares;
	private final String id;
	
	public Post(
			final String perfilImage, 
			final String image, 
			final String description,
			final String name, 
			final int likes, 
			final int shares, 
			final String id
	) {
		this.perfilImage = perfilImage;
		this.image = image;
		this.name = name;
		this.description = description;
		this.likes = likes;
		this.shares = shares;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLikes() {
		return likes;
	}
}
