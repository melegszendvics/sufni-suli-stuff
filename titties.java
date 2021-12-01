import java.util.*;

public class Main {
	public static void main(String[] args) {
		String xd = "a mate egy budos buzi";
		StringBuilder sb = new StringBuilder();
		int offset = 0;
		for (int i = 0; i < xd.length(); i++) {
		    char c = xd.charAt(i);
		    if (c == ' ') offset++;
		    sb.append((i+offset)%2 == 0 ? c : Character.toUpperCase(c));
		}
		System.out.println(sb);
	}
}ff
