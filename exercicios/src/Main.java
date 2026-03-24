import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> lista_carro = new ArrayList<Carro>();

        Carro carro1 = new Carro("Honda","HR-V", 2025);
        Carro carro2 = new Carro("Nissan","GT-R", 2011);
        lista_carro.add(carro1);
        lista_carro.add(carro2);
        for(int i = 0; i < lista_carro.size(); i++){
            lista_carro.get(i).ImprimirDados();
        }
    }
}

