package com.edataconsulting.refactoring;

public class Trip {
    public static double calculate(double[] dis, double[] speeds, double[] stops, int night) {
        double total = 0.0;

        for (int i = 0; i < dis.length; i++) {
            double actualSpeed = speeds[i];

            if (night == 1) {
                actualSpeed = actualSpeed * 0.8;
            }

            double subtotal = dis[i] / actualSpeed;
            total = total + subtotal;

            // Si `i` es menor que la cantidad de pausas, suma `stops[i]` al total.
            // Esto evita acceder fuera de los límites del array, evitando errores.
            // `stops[i]` representa el tiempo de pausa en el tramo `i` del viaje.
            if (i < stops.length) {
                total += stops[i];
            }
        }

        return total;
    }
}
