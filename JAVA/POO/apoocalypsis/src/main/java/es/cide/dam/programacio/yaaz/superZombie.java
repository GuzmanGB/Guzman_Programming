package es.cide.dam.programacio.yaaz;

public class superZombie extends zombie {
    
    private int salutSuperZ;
    private int fuerzaSuperZ;
    private int defensaSuperZ;

    public superZombie() {
        this.salutSuperZ = salutZombie * 3;
        this.defensaSuperZ = defensaZombie;
        this.fuerzaSuperZ = fuerzaZombie * 2;
    }

    @Override
    public int getSalutZombie() {
        return salutSuperZ;
    }

    @Override
    public int getFuerzaZombie() {
        return fuerzaSuperZ;
    }

    @Override
    public int getDefensaZombie() {
        return defensaSuperZ;
    }

    @Override
    public void setSalutZombie(int salutSuperZombie) {// Método para establecer una nueva salud
        this.salutSuperZ = salutSuperZombie; // Asigna el valor proporcionado a la salud.
    }
    
    @Override
    public void setFuerzaZombie(int fuerzaSuperZombie) {
        this.fuerzaSuperZ = fuerzaSuperZombie;
    }
    
    @Override
    public void setDefensaZombie(int defensaSuperZombie) {
        this.defensaSuperZ = defensaSuperZombie;
    }
    
    @Override
    public int ataca() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable atacaZombie
        int fuerzaZombieSuper = random.nextInt(fuerzaSuperZ); // Genera un valor aleatorio entre 0 y la fuerza máxima
        return fuerzaZombieSuper; // Devuelve el valor del ataque
    }
    
    @Override
    public int defensat() { // Método que le asigna un valor aleatorio entre un mínimo y un máximo a la variable defensatZombie
        int defensaZombieSuper = random.nextInt(defensaSuperZ);
        return defensaZombieSuper;
    }

}
