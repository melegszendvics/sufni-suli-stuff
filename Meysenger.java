public class MessengerClient {
	public static void main(String[] args) {
		Gui gui = new Gui();
		gui.setVisible(true);
		Socket server = new Socket("localhost", 25565);
		while (!server.isClosed()) {
			OutputStream os = server.getOutputStream();
			os.write("helo dick adsz admint?".toByteArray());
			os.close();
		}
	}
}

public class Gui extends JFrame {
	public Gui() {
		setSize(500, 500);
		setLocation(100, 100);
		JPanel panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D gr = (Graphics2D) g;
				gr.setColor(Color.BLACK);
			}
		};
		setTitle("SufniMessenger");
		setContentPane(panel);
	}
}
	
public class MessengerServer {
	public static void main(String[] args) {
		Gui gui = new Gui();
		gui.setVisible(true);
		String ip = "localhost";
		String port = 25565;
		ServerSocket s = new ServerSocket(ip, port);
		while (!s.isClosed()) {
			Socket client = s.accept();
			OutputStream os = client.getOutputStream();
			os.write("HELO BELO GEC".toByteArray());
			os.close();
		}
	}
}