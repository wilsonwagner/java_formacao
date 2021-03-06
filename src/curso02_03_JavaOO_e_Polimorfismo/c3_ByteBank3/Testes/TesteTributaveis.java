package curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Testes;

import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.CalculadorDeImposto;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.ContaCorrente;
import curso02_03_JavaOO_e_Polimorfismo.c3_ByteBank3.Modulos.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.print(calc.getTotalImposto());
    }
}
