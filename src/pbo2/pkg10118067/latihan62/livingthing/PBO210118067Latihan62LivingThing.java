/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan62.livingthing;

/**
 *
 * @author
 * Agus Awaludin
 * 10118067
 * PBO2 / IF2
 * Latihan ini berisi tentang bagaimana menyelesaikan studi kasus
 * dengan konsep abstrak
 */
public class PBO210118067Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Agus Awaludin");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
