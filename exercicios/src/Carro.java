import java.security.PublicKey;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public Carro(){

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(1886 < ano && ano < 2026){
            this.ano = ano;
        }else {
            System.out.println("Erro 'ano' inválido");
        }
    }

    public void ImprimirDados(){//ou exibir() faz a mesma coisa
        System.out.println("- Dados do Carro -");
        System.out.println("Marca :" + marca);
        System.out.println("Modelo :" + modelo);
        System.out.println("Ano :" + ano);
        System.out.println("Idade :" + idadeDoCarro());
    }

    public int idadeDoCarro(){
        return 2026 - ano;
    }// Essa funcao retorna um valor int e executa apenas uma açao


}
