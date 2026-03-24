import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> lista_carro = new ArrayList<Carro>();

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Honda");
        carro1.setModelo("HR-V");
        carro1.setAno(2025);
        carro2.setMarca("Nissan");
        carro2.setModelo("GT-R");
        carro2.setAno(2011);

        lista_carro.add(carro1);
        lista_carro.add(carro2);
        for(int i = 0; i < lista_carro.size(); i++){
            lista_carro.get(i).ImprimirDados();
        }
    }
}

