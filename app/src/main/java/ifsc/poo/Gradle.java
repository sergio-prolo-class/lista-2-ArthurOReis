package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Gradle {
    private int x;
    private int y;
    private final int tamanhoGrade = 40;

    public Draw desenhar(Draw obj){
        this.x = 10; // Número de linhas
        this.y = 10; // Número de colunas

        for (int i = 0; i <= x; i++) {
            double xPos = i * tamanhoGrade;
            obj.line(xPos, 0, xPos, y * tamanhoGrade);
        }

        for (int i = 0; i <= y; i++) {
            double yPos = i * tamanhoGrade;
            obj.line(0, yPos, x * tamanhoGrade, yPos);
        }    

        return obj;
    }
}
