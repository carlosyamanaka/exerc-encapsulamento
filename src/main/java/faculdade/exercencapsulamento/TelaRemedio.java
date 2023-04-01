/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.exercencapsulamento;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class TelaRemedio {
    void scanRemedio(Remedio r){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        r.setNome(teclado.nextLine());
        System.out.println("Digite o preço: ");
        r.setPreco(teclado.nextFloat());
        teclado.nextLine();
        System.out.println("Digite o descrição: ");
        r.setDescricao(teclado.nextLine());
        System.out.println("Digite o posologia: ");
        r.setPosologia(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Digite o nome tecnico: ");
        r.setNometec(teclado.nextLine());
    }
    
    void printRemedio(Remedio r){
        System.out.println("\nNome: " + r.getNome());
        System.out.println("Preco: "+r.getPreco());
        System.out.println("Descricao: "+r.getDescricao());
        System.out.println("Posologia: "+r.getPosologia());
        System.out.println("Nome tecnico: "+r.getNometec());
    }
    
}
