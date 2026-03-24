public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
