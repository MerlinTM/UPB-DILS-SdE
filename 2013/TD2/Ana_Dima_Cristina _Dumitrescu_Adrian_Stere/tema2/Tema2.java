/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 * TP2
 * @author Ana Dima, Cristina Dumitrescu, Adrian Stere (1221F)
 * @version 1, 10 mar 2013
 */
public class Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Buffer b= new Buffer();
        Consumer c1= new Consumer(b);
        Producer p1= new Producer(b);
       
        p1.start();
        c1.start();
        
       
        // TODO code application logic here
    }
}
