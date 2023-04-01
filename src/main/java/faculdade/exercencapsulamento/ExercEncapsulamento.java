/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package faculdade.exercencapsulamento;

/**
 *
 * @author carlo
 */
public class ExercEncapsulamento {

    public static void main(String[] args) {
        Remedio r1 = new Remedio();
        TelaRemedio tr1 = new TelaRemedio();
        
        tr1.scanRemedio(r1);
        tr1.printRemedio(r1);
    }
}
