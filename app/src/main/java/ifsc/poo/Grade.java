package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linha;
    private int coluna;
    private final int tamanhoGrade = 40;

    public Draw desenhar(Draw obj) {
        String caracteres[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        this.linha = 10;
        this.coluna = 10;

        for (int i = 0; i <= linha; i++) {
            double xPos = i * tamanhoGrade + tamanhoGrade; 
            obj.line(xPos, tamanhoGrade, xPos, (coluna + 1) * tamanhoGrade);
        }

        for (int i = 0; i <= coluna; i++) {
            double yPos = i * tamanhoGrade + tamanhoGrade;
            obj.line(tamanhoGrade, yPos, (linha + 1) * tamanhoGrade, yPos);
        }

        obj.setPenColor(Draw.BOOK_RED);

        for (int i = 0; i < coluna; i++) {
            double yPos = (i + 1) * tamanhoGrade + tamanhoGrade / 2; 
            obj.text(tamanhoGrade / 2, yPos, caracteres[i]);
        }

        for (int i = 0; i < linha; i++) {
            double xPos = (i + 1) * tamanhoGrade + tamanhoGrade / 2; 
            obj.text(xPos, tamanhoGrade / 2, String.valueOf(i));
        }

        return obj;
    }
}
