public class Asentamiento {
    private String cmv;
    public int codigoPostal;
    public String nombre;
    public String ciudad;
    public String estado;
    public String estatus;
    //variables para guardar los datos del cmv

    public Asentamiento(String cmv){
        this.cmv = cmv;
        codigoPostal = Integer.parseInt(cmv.substring(0, 5));
        nombre = metodo();
        ciudad = metodo();
        estado = metodo();
        estatus = cmv.substring(cmv.lastIndexOf(',') + 1);
        System.out.println(codigoPostal + ", " + nombre + ", " + ciudad + ", " + estado + ", " + estatus + ".");
        //esto guarda lo del cmv en las variables y imprime lo que se guardo
    }

    private String metodo(){
        String A = cmv.substring(cmv.indexOf(',') + 1, cmv.indexOf(',', cmv.indexOf(',') + 1));
        cmv = cmv.substring((cmv.indexOf(',') + 1));
        return A;
        //esto separa los datos y remueve las comas 
    }
}

