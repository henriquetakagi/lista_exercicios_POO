public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void ImprimirDados(){
        System.out.println("- Dados do Carro -");
        System.out.println("Marca :" + marca);
        System.out.println("Modelo :" + modelo);
        System.out.println("Ano :" + ano);
    }


}
