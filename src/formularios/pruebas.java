package formularios;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {

        /*
        String trama = "02005404771587462280   ;000000000001000;000000000001000;20230427;152456;0000000100001919281258131528120519730      ;984073;00 10000001        000000000000095Pruebas PlacetoPay NOTAntofagasta  CL2  1528400000001527052023042720185600000000000000000000002 cuotas financ. comercio                                   21               00000000000000000000000000000004540477101000000000812280             ";
        String[] desglorar = trama.split(";");
        String valor = desglorar[1];
        String valor2 = desglorar[2];
        String fecha = desglorar[3];
        String hora = desglorar[4];
        String codAutotizador;

        int autorizadorCodigo = (int) (Math.random() * 999998 + 1);

        codAutotizador = Integer.toString(autorizadorCodigo);

        System.out.println(codAutotizador);

        System.out.println(desglorar[0] + valor + valor2 + fecha + hora + desglorar[5] + codAutotizador + desglorar[7]);
        */

        double n = 145;
        String patron = "##########,##";
        DecimalFormat formato = new DecimalFormat(patron);
        System.out.println(formato.format(n));

    }
}
