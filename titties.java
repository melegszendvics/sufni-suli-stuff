public class Main {
	public static void main(String[] args) {
		String str = "danoyoc egy budos buzi";
		for (int i = 0; i < str.length(); i++) {
		    if (i%2==0) {
		        str = str.replace(""+str.charAt(i), (""+str.charAt(i)).toUpperCase());
		    }
		}
		System.out.println(str);
	}
}
