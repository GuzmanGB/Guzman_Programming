package es.cide.dam.programacio.yaaz;

import java.util.Scanner;

public class combateZomSup {

    public combateZomSup() {
   
    }

    public void peleaEntreZombieSuperv() {
        
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario

        System.out.println("Inserte el nombre del superviviente: "); 
        String nombreSuperviviente = sc.nextLine(); 
        supervivent superviviente = new supervivent(nombreSuperviviente); // Crea un nuevo objeto superviviente con el nombre dado anteriormente por terminal

        System.out.println("Inserte el tamaño de la ciudad: ");
        int tamañoCiudad = sc.nextInt();
        System.out.println("Inserte el nombre de la ciudad: ");
        String nombreCiudad = sc.next(); 

        novaCiutat ciutat = new novaCiutat(tamañoCiudad, nombreCiudad);

        // Imprime la información de la ciudad
        System.out.println("\nTamaño ciudad: " + ciutat.getTamaño());
        System.out.println("Nombre ciudad: " + ciutat.getNombreCiudad() + "\n");

        // Bucle para simular las peleas entre el superviviente y los zombies
        for (int i = 0; i < tamañoCiudad; i++) { // Se ejecutará un bucle que llegará de máximo hasta el número especificado en la variable de "tamañoCiudad"

            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------\n");
        
                    // Verifica si el superviviente aún tiene salud y si es así continua con el programa
                    if (superviviente.getSalutSupervivent() > 0) {
                            ciutat.mostrarArtefactesCaixa(i,superviviente);

                            zombie newZombie = ciutat.posicioRuta(i); // Genera un zombie en la posición "i" de la ciudad
                            
                            if (newZombie.getSalutZombie()>20) {
                                System.out.println("A APARECIDO LA EVOLUCIÓN DEL ZOMBIE! UN SUPER ZOMBIE!");
                            }
                            
                            else{
                                System.out.println("Zombie " + i + " ha aparecido");
                            }

                            System.out.println("Vida superviviente " + superviviente.getSalutSupervivent()); 
                            System.out.println("Vida zombie " + newZombie.getSalutZombie() + "\n");

                            // En este punto inicia la pelea entre el zombie y el superviviente
                            while (newZombie.getSalutZombie() > 0 && superviviente.getSalutSupervivent() > 0) { // Mientras ambos estén vivos la pelea se seguirá ejecutando

                                System.out.println("SUPERVIVIENTE ATACA AL ZOMBIE!"); 

                                int ataqueSuperviv = superviviente.ataca(); // Guardo el método de "ataca" del superviviente en una variable ya que este método da un número aleatorio
                                int defensaZombie = newZombie.defensat(); // Guardo el método de "defensat" del zombie en una variable ya que este método da un número aleatorio

                                // Compara si la defensa del zombie es menor que el ataque del superviviente
                                if (defensaZombie < ataqueSuperviv) {

                                    int valorAtaqueSuperviv = (ataqueSuperviv - defensaZombie); // Guarda en una variable el cálculo entre el ataque del superviviente y la defensa del zombie
                                    System.out.println("El superviviente ataca con " + ataqueSuperviv
                                            + " puntos, y el zombie se defiende con " + defensaZombie + " puntos");

                                    newZombie.setSalutZombie((newZombie.getSalutZombie() - valorAtaqueSuperviv)); // Reduce la vida del zombie mediante el valor del cálculo anterior de "valorAtaqueSuperviv"
                                    System.out.println("El superviviente le hace " + valorAtaqueSuperviv
                                            + " de daño, el zombie se queda con " + newZombie.getSalutZombie() + " HP\n");

                                } else { // Si la defensa del zombie es mayor a la del ataque del superviviente:
                                    System.out.println("El zombie ha hecho parry al superviviente! \nNo recibe daño");
                                    System.out.println("El zombie se queda con " + newZombie.getSalutZombie() + " HP\n");
                                }

                                // Si el zombie aún está vivo realiza su ataque
                                if (newZombie.getSalutZombie() > 0) {

                                    System.out.println("ZOMBIE ATACA AL SUPERVIVIENTE!");

                                    int ataqueZombie = newZombie.ataca(); // Guardo el método de "ataca" del zombie en una variable ya que este método da un número aleatorio
                                    int defensaSuperviv = superviviente.defensat(); // Guardo el método de "defensat" del superviviente en una variable ya que este método da un número aleatorio

                                    // Compara si la defensa del superviviente es menor que el ataque del zombie
                                    if (defensaSuperviv < ataqueZombie) {

                                        int valorAtaqueZombie = (ataqueZombie - defensaSuperviv);  // Guarda en una variable el cálculo entre el ataque del zombie y la defensa del superviviente
                                        System.out.println("El zombie ataca con " + ataqueZombie
                                                + " puntos, y el superviviente se defiende con " + defensaSuperviv + " puntos");

                                        superviviente.setSalutSupervivent((superviviente.getSalutSupervivent() - valorAtaqueZombie));  // Reduce la vida del superviviente mediante el valor del cálculo anterior de "valorAtaqueZombie"
                                        System.out.println("El zombie le hace " + valorAtaqueZombie + " de daño, "
                                                + superviviente.getNameSupervivent() + " se queda con "
                                                + superviviente.getSalutSupervivent() + " HP\n");

                                    } else { // Si la defensa del superviviente es mayor a la del ataque del zombie:
                                        System.out.println(
                                                superviviente.getNameSupervivent() + " ha hecho parry al zombie! \nNo recibe daño");
                                        System.out.println("Vida de superviviente " + superviviente.getNameSupervivent() + ": "
                                                + superviviente.getSalutSupervivent() + " HP\n");
                                    }
                                }

                                // Si el zombie muere se muestra el siguiente mensaje:
                                else {
                                    System.out.println("El zombie " + i + " ha muerto");
                                }
                            }
                        }else { // Si el superviviente muere termina el ciclo de pelea
                            System.out.println("\nEl superviviente " + superviviente.getNameSupervivent() + " ha muerto");
                            i = tamañoCiudad; // Como no aparecen mas superviviente se rompe el bucle "for" asignandole el número del tamaño de la ciudad a la variable "i" 
                        }
                    
            }

        // Si el superviviente acaba matando a todos los zombies de la ciudad muestra el siguiente mensaje:
        if (superviviente.getSalutSupervivent() > 0) {
            System.out.println("\nEL SUPERVIVIENTE HA SOBREVIVIDO A LA CIUDAD\n");

            System.out.println(
                            "db    db d888888b  .o88b. d888888b  .d88b.  d8888b. db    db \r\n" + //
                            "88    88   `88'   d8P  Y8 `~~88~~' .8P  Y8. 88  `8D `8b  d8' \r\n" + //
                            "Y8    8P    88    8P         88    88    88 88oobY'  `8bd8'  \r\n" + //
                            "`8b  d8'    88    8b         88    88    88 88`8b      88    \r\n" + //
                            " `8bd8'    .88.   Y8b  d8    88    `8b  d8' 88 `88.    88    \r\n" + //
                            "   YP    Y888888P  `Y88P'    YP     `Y88P'  88   YD    YP    \r\n" + //
                            "                                                             \r\n" + //
                            "                                                             ");
        }

        sc.close();
        
    }

}
