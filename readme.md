# Lista 2: Modelagem de classes e uso de dependências

## Engenharia de Telecomunicações - Prof. Sergio Prolo

## Programação Orientada a Objetos sergio.prolo@ifsc.edu.br

#### 04/05/2025
#### Aluno: Arthur Oliveira dos Reis

---

## Introdução

Este projeto foi desenvolvido como parte da disciplina de **Programação Orientada a Objetos** do curso de Engenharia de Telecomunicações no IFSC. O objetivo principal é modelar classes e implementar métodos de forma clara e organizada, além de aplicar conceitos fundamentais de encapsulamento, herança, polimorfismo e uso de dependências externas.

O projeto é composto por várias etapas que abrangem desde a configuração inicial do ambiente até a criação de uma aplicação funcional que faz uso da biblioteca externa **algs4.jar**.

---

## Informações iniciais

- Este repositório utiliza uma aplicação padrão Gradle. Todas as etapas do projeto foram implementadas conforme descrito neste documento.
- Com o uso do **Git**, foram realizadas práticas recomendadas como:
  - **Commits** frequentes e bem descritos.
  - Um arquivo **README.md** informativo.
  - Configuração de um arquivo **.gitignore** eficaz.

- A aplicação foi desenvolvida seguindo critérios de legibilidade, clareza e organização, com o uso de boas práticas de programação e modelagem.

---

## Etapa 1: Dependência e inicialização da aplicação

### Configuração da Dependência Externa
Baixe o arquivo algs4.jar aqui e o coloque no diretório app/libs do seu projeto. Faça os ajustes necessários
no arquivo build.gradle para adicionar essa biblioteca como dependência do seu projeto. Instruções mais
detalhadas estão nos slides de Ferramentas (2).

Na classe App, crie um atributo chamado draw para armazenar um objeto da classe
edu.princeton.cs.algs4.Draw. Esse objeto será usado para desenhar na tela do computador usando a
sua aplicação.

- Usar uma janela de dimensão 1000 × 600 pixels
- Usar uma escala de 0 a 1000 no eixo X da janela
- Usar uma escala de 0 a 600 no eixo Y da janela
- Fechar a janela quando o usuário clicar no botão de fechar a janela

## Etapa 2: Grade

Modele uma classe chamada Grade que é de desenhar uma grade do tabuleiro de batalha naval. Especificamente:

- A classe Grade deve ter um método público chamado desenhar que recebe um objeto Draw como
argumento.
- O método desenhar deve usar o objeto Draw para desenhar uma grade 10 times 10 na tela.
- Cada célula da grade deve ter dimensão de 40 × 40 pixels.
- A grade deve ser desenhada com seu canto inferior esquerdo na posição (x, y) da tela. Os valores
de x e y devem ser informados durante a construção do objeto Grade.
- A grade deve ser desenhada com rótulos para as linhas e colunas.

## Etapa 3: Navio

Modele uma classe chamada Navio que é capaz de desenhar um navio em uma grade. Especificamente:

- A classe Navio deve ter um método público chamado desenhar que recebe um objeto Draw como
argumento.
- O método desenhar deve usar o objeto Draw para desenhar um navio na tela.

- O objeto Navio deve ser construído com argumentos para definir à qual Grade ele pertence, seu
tamanho, posição (x, y) na grade e orientação (vertical ou horizontal) (Por exemplos, o Navio da
Figura 2 possui tamanho 5, posição (3, 2) e orientação vertical)
- O Navio deve ser desenhado como uma série de quadrados coloridos. A dimensão dos quadrados é
igual ao tamanho da célula da Grade (40 × 40 pixels). A cor dos quadrados deve ser a mesma dos
rótulos da Grade.

## Etapa 4: Navio

Para esse fim:

- Crie duas grades e posicione elas em lados opostos da tela. A grade da esquerda representa o
tabuleiro do jogador, enquanto a grade da direita representará os alvos do jogador no tabuleiro inimigo.
- Crie cinco navios e posicione-os na grade a esquerda, representando os navios do jogador. Posicioneos como na Figura 3.

## Conclusões

Apesar de alguns desafios enfrentados, especialmente na implementação da segunda grade e na manipulação de rótulos, o projeto foi concluído com sucesso. A construção das classes `Grade` e `Navio`, bem como sua integração, resultou em uma aplicação funcional e alinhada aos objetivos propostos.