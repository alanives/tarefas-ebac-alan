public class Aula {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;

    public Aula() {
    }

    public Aula(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public static void main(String args[]) {
        Aula aula1 = new Aula(8.5f, 6.5f, 10, 6);
        aula1.calculaMedia();

        System.out.println("Média aula 1 = " + aula1.getMedia());

        Aula aula2 = new Aula();
        aula2.setNota1(10);
        aula2.setNota2(8);
        aula2.setNota3(4.5f);
        aula2.setNota4(7.5f);
        aula2.calculaMedia();

        System.out.println("Média aula 2 = " + aula2.getMedia());
    }

    public void calculaMedia() {
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
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

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }
}
