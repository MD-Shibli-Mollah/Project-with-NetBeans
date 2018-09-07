/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritencemy_18;

public class Book extends Item{
    
    double pricem = 4;

    public Book() {
        this.pricem = 5;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPrice() {
        return pricem+= 20;
    }
}
