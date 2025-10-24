package exeMeioPgto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPagamento {
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        CartaoCredito cartaoCredito =  new CartaoCredito();
        Pix pix1 = new Pix();
        Pix pix2 = new Pix();
        CartaoCredito cartaoCredito1 =  new CartaoCredito();

        pagamentos.add(cartaoCredito);
        pagamentos.add(pix1);
        pagamentos.add(pix2);
        pagamentos.add(cartaoCredito1);

        Scanner sc = new Scanner (System.in);
        for(Pagamento p : pagamentos) {
            System.out.println("\nInforme o valor da autorização: R$ ");
            p.autorizar(sc.nextDouble());
        }
    }
}
