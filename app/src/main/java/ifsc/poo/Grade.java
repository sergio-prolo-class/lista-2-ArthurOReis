package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade { // Classe responsável por instanciar objetos do tipo Grade
    private int linha;
    private int coluna;
    private final int tamanhoGrade = 40;

    public Draw desenhar(Draw obj) {
        // Label divisória da coluna
        String caracteres[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        this.linha = 10;
        this.coluna = 10;

        // Printa as linhas verticais da grade
        for (int i = 0; i <= linha; i++) {
            double xPos = i * tamanhoGrade + tamanhoGrade; 
            obj.line(xPos, tamanhoGrade, xPos, (coluna + 1) * tamanhoGrade);
        }

        // Printa as linhas horizontais da grade
        for (int i = 0; i <= coluna; i++) {
            double yPos = i * tamanhoGrade + tamanhoGrade;
            obj.line(tamanhoGrade, yPos, (linha + 1) * tamanhoGrade, yPos);
        }

        obj.setPenColor(Draw.BOOK_RED); // Configura a cor do texto para ser vermelho, para as labels

        // Adiciona a label da coluna em ordem alfabética (A, B, C, ...)
        for (int i = 0; i < coluna; i++) {
            double yPos = (i + 1) * tamanhoGrade + tamanhoGrade / 2; 
            obj.text(tamanhoGrade / 2, yPos, caracteres[i]);
        }

        // Adiciona a label da linha em ordem numérica (0, 1, 2, ...)
        for (int i = 0; i < linha; i++) {
            double xPos = (i + 1) * tamanhoGrade + tamanhoGrade / 2; 
            obj.text(xPos, tamanhoGrade / 2, String.valueOf(i));
        }

        return obj;
    }
}
