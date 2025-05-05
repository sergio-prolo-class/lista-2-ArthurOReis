package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class App {
    edu.princeton.cs.algs4.Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        draw.setCanvasSize(1000, 600);
        draw.setXscale(0, 1000);
        draw.setYscale(0, 600); 

        Grade grade = new Grade();
        grade.desenhar(draw);

        Navio navio = new Navio(5, 4, 3, true);
        navio.desenhar(draw);
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.draw.show();
    }
}
