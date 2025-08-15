public class Asentamiento {
    private String cmv;
    public int codigoPostal;
    public String nombre;
    public String ciudad;
    public String estado;
    public String estatus;

    public Asentamiento(String cmv){
        this.cmv = cmv;
        codigoPostal = Integer.parseInt(cmv.substring(0, 5));
        nombre = metodo();
        ciudad = metodo();
        estado = metodo();
        estatus = cmv.substring(cmv.lastIndexOf(',') + 1);
        System.out.println(codigoPostal + ", " + nombre + ", " + ciudad + ", " + estado + ", " + estatus + ".");
    }

    private String metodo(){
        String A = cmv.substring(cmv.indexOf(',') + 1, cmv.indexOf(',', cmv.indexOf(',') + 1));
        cmv = cmv.substring((cmv.indexOf(',') + 1));
        return A;
    }
}
