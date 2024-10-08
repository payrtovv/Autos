public class Main {
    public static void main(String[] args){
        Auto bmw = new Auto("bmw");

        //bmw.setMarca("BMW");
        bmw.setModelo("1537");
        bmw.setColor("Rojo");
        bmw.setClindraje(123);

        bmw.verDetalle();

        Auto bmw2 = new Auto("MERCEDES", "ML200");

        //bmw2.setMarca("BMW");
        //bmw2.setModelo("1537");
        bmw2.setColor("Rojo");
        bmw2.setClindraje(123);

        System.out.println("--------------------------");

        bmw2.verDetalle();
    }
}

//crear clase jugador, poner almenos 6 atributos, stter getter y desplegat la alineacion de esos jugadores