public class RutaMasEconomica implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando métodos de transporte");
        System.out.println("Viendo pasajes");
        System.out.println("Calculando distancia");

        return "Ruta más ecónomica entre " + puntoA + " y " + puntoB + "es utilizando el autobus linea 14";
        
    }

}
