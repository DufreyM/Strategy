//Estrategia propia
public class RutaMasSegura implements RutaStrategy{
    public String calcularRuta(String puntoA, String puntoB) {
        System.out.println("Calculando rutas...");
        System.out.println("Verificando el estado de las carreteras");
        System.out.println("Verificando accidentes registrados");
        
        return "Ruta más segura entre " + puntoA + " y " + puntoB + "es viajar caminando por el parque"; 
    }
}
