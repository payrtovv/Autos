public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int clindraje;

    //constructores

    public Auto(){
    }

    public Auto(String marca) {
        this.marca = "bmw";
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //metds set y get

    public int getClindraje() {
        return clindraje;
    }

    public void setClindraje(int clindraje) {
        this.clindraje = clindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    // Metdos propios u de calculo

    public void verDetalle(){
        String dv = "La marca es: " + getMarca() + "\n" +
                "El modelo es: " + getModelo() + "\n" +
                "El color es: " + getColor() + "\n" +
                "El cilindraje: " + getClindraje();

        System.out.println(dv);
    }



    // Modificacin de metods nativos

}
