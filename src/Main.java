public class Main {
    public static void main(String[] args){
        Auto bmw = new Auto();

        bmw.setMarca("BMW");
        bmw.setModelo("1537");
        bmw.setColor("Rojo");
        bmw.setClindraje(123);

        bmw.verDetalle();

        Auto bmw2 = new Auto();

        bmw2.setMarca("BMW");
        bmw2.setModelo("1537");
        bmw2.setColor("Rojo");
        bmw2.setClindraje(123);

        System.out.println("--------------------------");

        bmw2.verDetalle();
    }
}