public class Heo extends JFrame {
    public Heo() {
        setSize(500, 500);
        setLocation(1, 1);
        
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D gr = (Graphics2D) g;
				gr.setColor(Color.BLACK);
				gr.fillRect(0, 0, getWidth(), getHeight(), null);
                gr.setColor(Color.RED);
                int stringw = 30;
                int stringh = 15;
                Font f = new Font("Consolas", stringh, Font.BOLD);
                gr.setFont(f);
                int p = 5;
                Type ul = Type.UNDERLINE;
                ul.setStroke(2);
                drawString("XD", ul, p, p, stringw, stringh, gr);   
            }
        };
        setContentPane(panel);
    }
    
    public void drawString(String str, Type t, int x, int y, int w, int h, Graphics2D g) {
        if (t != Type.BOLD) g.drawString(str, x, y, w, h);
        Stroke defStroke = g.getStroke();
        g.setStroke(t.getStroke());
        switch (t) {
            case UNDERLINE -> {
                g.drawLine(x, y, w, h);                
            }
            case STRIKETHROUGH -> {
                g.drawLine(x+2, y/2, w+2, h/2);
            }
            case BOLD -> {
                Font def = g.getFont();
                g.setFont(new Font("Consolas", h, Font.BOLD));
                g.drawString(str, x, y, w, h);
                g.setFont(def);
            }
            case FRAMED -> {
                g.drawRect(x-5-t.getStroke(), y-5-t.getStroke(), w+5+t.getStroke(), h+5+t.getStroke());
            }
        }
        g.setStroke(defStroke);
    }
    
    public static void main(String[] args) {
        Heo he = new Heo();
        he.setVisible(true);
    }
    
    public enum Type {
        UNDERLINE,
        STRIKETHROUGH,
        BOLD,
        FRAMED;
        
        int stroke;
        
        Type(int stroke) {
            this.stroke = stroke;
        }
        
        int getStroke() {
            return stroke;
        }
        
        int setStroke(int stroke) {
            this.stroke = stroke;
        }
    }
    
}