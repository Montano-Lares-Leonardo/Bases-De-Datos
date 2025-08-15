public class Asentamiento {
    private String csv;
    public int codigoPostal;
    public String nombre;
    public String ciudad;
    public String estado;
    public String estatus;
    //variables para guardar los datos del cmv

    public Asentamiento(String csv){
        this.csv = csv;
        codigoPostal = Integer.parseInt(csv.substring(0, 5));
        nombre = metodo();
        ciudad = metodo();
        estado = metodo();
        estatus = csv.substring(csv.lastIndexOf(',') + 1);
        System.out.println(codigoPostal + ", " + nombre + ", " + ciudad + ", " + estado + ", " + estatus + ".");
        //esto guarda lo del cmv en las variables y imprime lo que se guardo
    }

    private String metodo(){
        String A = csv.substring(csv.indexOf(',') + 1, csv.indexOf(',', csv.indexOf(',') + 1));
        csv = csv.substring((csv.indexOf(',') + 1));
        return A;
        //esto separa los datos y remueve las comas 
    }
}

