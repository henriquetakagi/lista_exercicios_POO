import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> lista_carro = new ArrayList<Carro>();

        Carro carro1 = new Carro("Honda","HR-V", 2025);
        Carro carro2 = new Carro("Nissan","GT-R", 2011);//Vantagem principal de de usar o metodo construtor não polui a tela e não tem chance de deixar dado passar as vezes posso chamar setMarca setModelo e esquece o set Ano
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        Carro carro5 = new Carro();
        lista_carro.add(carro1);
        lista_carro.add(carro2);
        lista_carro.add(carro3);//Oque muda na hora de imprimir esse novo que eu criei por padrao ja vem com os valores inseridos
        lista_carro.add(carro4);
        lista_carro.add(carro5);
        for(int i = 0; i < lista_carro.size(); i++){
            lista_carro.get(i).ImprimirDados();
        }
        Carro.imprimirTotal();
        System.out.println(Carro.totalCarros);//porque o atributo static é um valor da classe e não do objeto, resumindo atributo de static vale para classe toda e de instacia para cada objeto
    }//isso é um teste
}


