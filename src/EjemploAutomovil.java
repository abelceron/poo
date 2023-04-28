public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";

        Automovil mazda = new Automovil();
        subaru.fabricante = "Mazda";
        subaru.modelo = "BT-50";
        subaru.cilindrada = 3.0;
        subaru.color = "Rojo";

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());

    }
}
