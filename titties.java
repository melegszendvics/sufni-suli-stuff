public class Main {
	public static void main(String[] args) {
		String xd = "random"
		for (int i = 0; i<xd.length(); i++) {
		    if (i%==0) {
		        xd = xd.replace(xd.charAt(i), ((String) xd.chatAt(i)).toUpperCase());
		    }
		}
		System.out.println(xd);
	}
}
