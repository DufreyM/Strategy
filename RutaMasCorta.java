public class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando distancia...");
        System.out.println("Verificando desvíos");
        System.out.println("Confirmando metros recorridos");

        return "Ruta más Corta entre " + puntoA + " y " + puntoB + "es utilizando la calzada con automovil";
    }

}
