package org.example;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ServiciosAuto {
    public ServiciosAuto() {
    }

    public List<Auto> cargarAutos() {
        List<Auto> lista = new LinkedList();
        Auto a1 = new Auto(1, "Fiat", "rojo", "QAE2323", "UNO", 2005, Combustible.NAFTA, 5000.0, (byte)2);
        lista.add(a1);
        lista.add(new Auto(2, "Ford", "azul", "NEE1243", "FIESTA", 2010, Combustible.NAFTA, 6500.0, (byte)1));
        lista.add(new Auto(3, "Hyundai", "blanco", "PAB4355", "pik", 2019, Combustible.ELECTRICO, 28000.0, (byte)6));
        lista.add(new Auto(4, "VW", "verde", "SAS7813", "GOL", 2015, Combustible.NAFTA, 7200.0, (byte)3));
        lista.add(new Auto(5, "Chevrolet", "gris", "RAB3543", "Camioneta", 2020, Combustible.GASOIL, 31000.0, (byte)12));
        lista.add(new Auto(6, "Fiat", "verde", "OAR3981", "PREMIO", 2008, Combustible.NAFTA, 4800.0, (byte)1));
        lista.add(new Auto(7, "Suzuki", "gris", "FEE2525", "FIRE", 2011, Combustible.NAFTA, 8500.0, (byte)1));
        lista.add(new Auto(8, "BYD", "negro", "PES4530", "ONE", 2006, Combustible.NAFTA, 3500.0, (byte)1));
        lista.add(new Auto(9, "Toyota", "verde", "GAR2336", "HILUX", 2016, Combustible.GASOIL, 28600.0, (byte)1));
        lista.add(new Auto(10, "BYD", "blanco", "ADE8541", "Electric", 2020, Combustible.ELECTRICO, 32100.0, (byte)11));
        lista.add(new Auto(11, "Ford", "negro", "LAL2879", "Ferro", 2016, Combustible.NAFTA, 8500.0, (byte)1));
        lista.add(new Auto(12, "Mercedes", "blanco", "4321", "Adventure", 2018, Combustible.ELECTRICO, 55200.0, (byte)2));
        lista.add(new Auto(13, "Porsche", "negro", "NBC6658", "Lujo", 2019, Combustible.NAFTA, 41200.0, (byte)1));
        return lista;
    }

    public List<AutoDTO> transferirDatos(List<Auto> autos) {
        List<AutoDTO> dtos = new ArrayList();
        Iterator var3 = autos.iterator();

        while(var3.hasNext()) {
            Auto auto = (Auto)var3.next();
            AutoDTO dto = new AutoDTO(auto.getMarca(), auto.getModelo(), auto.getValor(), auto.getColor(), auto.getMatricula(), auto.getAnio(), auto.getCombustible(), auto.getStock());
            dtos.add(dto);
        }

        return dtos;
    }

    public void mostrar(List<AutoDTO> dtos) {
        Iterator var2 = dtos.iterator();

        while(var2.hasNext()) {
            AutoDTO dto = (AutoDTO)var2.next();
            PrintStream var10000 = System.out;
            String var10001 = dto.getMarca();
            var10000.println(var10001 + " -- " + dto.getCombustible() + " -- " + dto.getValor() + " -- " + dto.getStock() + " -- " + dto.getValor() * (double)dto.getStock());
        }

    }
}

