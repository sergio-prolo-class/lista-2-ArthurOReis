package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int linha;
    private int coluna;
    private final int tamanhoGrade = 40;

    public Draw desenhar(Draw obj){
        String caracteres[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        this.linha = 10; // Número de linhas
        this.coluna = 10; // Número de colunas

        for (int i = 0; i <= linha; i++) {
            double xPos = i * tamanhoGrade;
            obj.line(xPos, tamanhoGrade, xPos, coluna * tamanhoGrade);
        }

        for (int i = 0; i <= coluna; i++) {
            double yPos = i * tamanhoGrade;
            obj.line(tamanhoGrade, yPos, linha * tamanhoGrade, yPos);
        }

        obj.setPenColor(Draw.BOOK_RED);

        for (int i = 1; i <= linha; i++) {
            double yPos = i * tamanhoGrade;
            double espacamento = tamanhoGrade/2;
            obj.text(espacamento, ((yPos)*0.9) + espacamento, caracteres[i-1]);
        }

        for (int i = 1; i <= linha; i++) {
            double xPos = i * tamanhoGrade;
            double espacamento = tamanhoGrade/2;
            obj.text(((xPos)*0.9) + espacamento, espacamento, String.valueOf(i));
        }

        return obj;
    }
}
