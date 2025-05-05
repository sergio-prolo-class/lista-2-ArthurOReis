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

        Navio navio1 = new Navio(4, 1, 1, false);
        Navio navio2 = new Navio(5, 4, 3, true);
        Navio navio3 = new Navio(3, 6, 2, true);
        Navio navio4 = new Navio(3, 8, 6, true);
        Navio navio5 = new Navio(2, 2, 9, false);

        // Desenhar navios na grade do jogador
        navio1.desenhar(draw);
        navio2.desenhar(draw);
        navio3.desenhar(draw);
        navio4.desenhar(draw);
        navio5.desenhar(draw);
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.draw.show();
    }
}
