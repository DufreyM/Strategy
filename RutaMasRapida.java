public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando distancia...");
        System.out.println("Verificando tráfico");
        System.out.println("Verificando accidentes registrados");
        System.out.println("Confirmando tiempo de llegada aproximado");

        return "Ruta más rápida entre " + puntoA + " y " + puntoB + "es en motocicleta por medio de la autopista";
    }

}
