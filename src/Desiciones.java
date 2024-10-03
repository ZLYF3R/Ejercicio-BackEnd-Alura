public class Desiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("La película es nueva");
        } else {
            System.out.println("Es un clásico de ayer y hoy");
        }

        if (incluidoEnElPlan && tipoDePlan.equals("Plus")){
            System.out.println("Disfruta de la película");
        } else {
            System.out.println("No tienes acceso a este título");
        }

        switch (tipoDePlan) {
            case "Básico":
                System.out.println("Tu plan es " + tipoDePlan + ", te invitamos a adquirir el plan Plus");
                break;

            case "Plus":
                System.out.println("Tu plan es " + tipoDePlan);
                break;

            case "Free":
                System.out.println("Tu plan es " + tipoDePlan + ", te invitamos a adquirir el plan Básico o Plus");
                break;

            default:
                System.out.println("Contacta un asesor y adquiere alguno de nuestros planes");
        }
    }
}
