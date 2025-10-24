package exe1;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    // pode chamar o metodo sem precisar da instância do objeto (metodo static)
    public static void exibir (Veiculo veiculo) {
        System.out.println(veiculo.toString());
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro("ABC-1234", "Civic", 80000, 4);
        Moto m1 = new Moto("XYZ-9876", "CG", 15000, 160);
        Moto m2 = new Moto("LMN-5555", "Hornet", 35000, 600);
        Caminhao caminhao1 = new Caminhao("JKL-4321", "Volvo FH", 250000, 6);

        exibir(carro1);
        exibir(m1);
        exibir(m2);
        exibir(caminhao1);

        //adiciona no vetor
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(m1);
        veiculos.add(m2);
        veiculos.add(caminhao1);

        // Calculando imposto total
        double totalImpostos = 0;
        for (Veiculo veiculo : veiculos) { //percorre cada veiculo do vetor
            totalImpostos += veiculo.calcularImposto();
        }

        System.out.println("\nTotal de Impostos: R$ " + totalImpostos);
    }
}