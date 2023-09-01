package org.example;

import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ServiciosAuto serviciosAuto = new ServiciosAuto();
        List<Auto> autos = serviciosAuto.cargarAutos();
        System.out.println("----------------------------------------------------------------------");
        List<AutoDTO> dtos = serviciosAuto.transferirDatos(autos);
        serviciosAuto.mostrar(dtos);
        double totalAmount = 0.0;

        Auto auto;
        for(Iterator var7 = autos.iterator(); var7.hasNext(); totalAmount += auto.getValor() * (double)auto.getStock()) {
            auto = (Auto)var7.next();
        }

        System.out.println("======================================================================");
        System.out.println("Importe total en Autos U$S " + totalAmount);
    }
}
