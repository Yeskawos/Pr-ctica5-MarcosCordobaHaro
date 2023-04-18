/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre; //atributo nombre
    private String cuenta; //atributo cuenta
    private double saldo; //atributo saldo
    private double tipoInterés; //atributo tipo de Interés
    private static String ERRORCANTIDADNEGATIVA="No se puede ingresar una cantidad Negativa"; //atributo mensaje de error
    
    
    //Constructores
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom; 
        cuenta=cue;
        saldo=sal;
    }
    
    public double estado(){
        return this.getSaldo();
    }

    //Método ingresar
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) //si cantidad mayor a 0
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    //Método retirar
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the ERRORCANTIDADNEGATIVA
     */
    public static String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     * @param aERRORCANTIDADNEGATIVA the ERRORCANTIDADNEGATIVA to set
     */
    public static void setERRORCANTIDADNEGATIVA(String aERRORCANTIDADNEGATIVA) {
        ERRORCANTIDADNEGATIVA = aERRORCANTIDADNEGATIVA;
    }
}


    
   