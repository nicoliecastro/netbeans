/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo.animais;

class Papagaio extends Animal {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: CURUPACO PACO");
    }
}