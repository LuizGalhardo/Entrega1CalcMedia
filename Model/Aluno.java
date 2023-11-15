package Model;

/**
 *
 * @author Luiz Galhardo
 */
public class Aluno {
    
    private static long serialVersionUID = 1L;
    String nome = "";
    int cdAluno = 0;
    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    float mediaFinal = 0;

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(int cdAluno) {
        this.cdAluno = cdAluno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    
    
}
