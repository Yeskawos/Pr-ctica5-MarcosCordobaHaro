/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta; //Creamos una variable de tipo CCuenta
        double saldoActual; //Creamos una variable double para el saldo 
        
        
        //Creamos una cuenta 
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado(); //metemos el estado de la cuenta en una variable
        System.out.println("El saldo actual es"+ saldoActual );//Imprimimos el saldo
    }
    
    
    //Método para probar a ingresar dinero
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        //metemos un trycatch
        try {
          c.ingresar(cantidad);  //ingresamos la cantidad 
            if (c.getSaldo()!=cantidadEsperada) { //comprobamos la el estado con la cantidad esperada
                System.out.println("El saldo de la cuenta no coincide con la cantidad esperada"); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); //mensaje de error
        }
        
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        try {
            c.retirar(cantidad); //retiran la cantidad
            if (c.getSaldo()!=cantidadEsperada) { //comprobamos el estado de la cuenta con la cantidad esperada
                System.out.println("El saldo de la cuenta no coincide con la cantidad esperada");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); //mensaje de error
        }
        
    }
}
 
