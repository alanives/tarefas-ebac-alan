/**
 * Classe carro
 *
 * @author alanives
 */
public class Carro {
    private String marca;
    private String modelo;
    private String ano;
    private String cor;

    /**
     * Cria novo carro
     *
     * @param marca marca do carro
     * @param modelo modelo do carro
     * @param ano ano do carro
     * @param cor cor do carro
     */
    public void Carro(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    /**
     * Define marca do carro
     *
     * @param marca marca do carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Define modelo do carro
     *
     * @param modelo modelo do carro
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Define ano do carro
     *
     * @param ano ano do carro
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * Define cor do carro
     *
     * @param cor cor do carro
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Retorna marca do carro
     *
     * @return marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna modelo do carro
     *
     * @return modelo do carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Retorna ano do carro
     *
     * @return ano do carro
     */
    public String getAno() {
        return ano;
    }

    /**
     * Retorna cor do carro
     *
     * @return cor do carro
     */
    public String getCor() {
        return cor;
    }
}
