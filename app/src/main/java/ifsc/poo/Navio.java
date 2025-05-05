package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Navio {
    final private int tamanho;
    final private int linha;
    final private int coluna;
    final private boolean orientacao; // vertical = true; horizontal = false
    private final int tamanhoGrade = 40;

    public Navio(int tamanho, int linha, int coluna, boolean orientacao) {
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.orientacao = orientacao;
    }

    public void desenhar(Draw obj) {
        obj.setPenColor(Draw.BOOK_RED);

        for (int i = 0; i < tamanho; i++) {
            double x, y;

            if (orientacao) { // sentido vertical
                x = (linha + 0.5) * tamanhoGrade;
                y = (coluna + i + 0.5) * tamanhoGrade;
            } else { // sentido horizontal
                x = (linha + i + 0.5) * tamanhoGrade;
                y = (coluna + 0.5) * tamanhoGrade;
            }

            obj.filledSquare(x, y, tamanhoGrade / 2.0);
        }
    }
}