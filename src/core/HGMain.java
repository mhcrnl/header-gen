package core;

public class HGMain {
	
	private static final int WIDTH = 80;

	/**
	 * Make one of these:
	 * /*********************** TITLE *********************\/
	 */
	public static void main(String[] args) {
		if(args.length < 1) {
			System.err.println("Please provide a title.");
			System.exit(1);
		}
		
		String title = args[0];
		System.out.println("Title: " + title);
		
		int sideLength = (WIDTH - 2 - 2 - title.length()) / 2;
		StringBuilder builder = new StringBuilder(80);
		builder.append('/');
		for(int i = 0; i < sideLength; i++) {
			builder.append('*');
		}
		builder.append(" ");
		builder.append(title);
		builder.append(" ");
		while(builder.toString().length() < WIDTH - 1) {
			builder.append('*');
		}
		builder.append('/');
		
		System.out.println("Use this:");
		System.out.println(builder.toString());
	}

}
