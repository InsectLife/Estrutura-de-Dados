package atividade2;

public class Vetor {
    private Aluno[] alunos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        this.alunos = new Aluno[capacidade];
        this.tamanho = 0;
    }

    public void adicionaAluno(Aluno aluno) {
        if (tamanho < capacidade) {
            alunos[tamanho] = aluno;
            tamanho++;
        } else {
            System.out.println("O vetor está cheio");
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (aluno == alunos[i]) {
                return true;
            }
        }
        return false;
    }

}
