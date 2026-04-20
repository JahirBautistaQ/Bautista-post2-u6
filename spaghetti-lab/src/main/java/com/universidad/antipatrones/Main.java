package com.universidad.antipatrones;

public class Main {

    public static void main(String[] args) {

        ProcesadorPedidos procesador = new ProcesadorPedidos();

        procesador.procesarPedido(new Pedido("P001", "VIP", 1200, "VIPEXTRA"));
        procesador.procesarPedido(new Pedido("P002", "VIP", 600, "VIP20"));
        procesador.procesarPedido(new Pedido("P003", "PREMIUM", 300, "PREM10"));
        procesador.procesarPedido(new Pedido("P004", "ESTANDAR", 150, "FIRST50"));
    }
}