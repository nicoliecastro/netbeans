/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo.animais;

import Zoo.animais.Animal;
import java.util.ArrayList;
import java.util.List;

class ZooManager {
    private List<Animal> animais;

    public ZooManager() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println(animal.getNome() + " foi adicionado ao zoológico.");
    }

    public void listarAnimais() {
        System.out.println("Animais registrados no zoológico:");
        for (Animal animal : animais) {
            System.out.println("- " + animal.getNome() + " (Tipo: " + animal.getClass().getSimpleName() + ")");
        }
    }

    public void emitirSomDeTodosAnimais() {
        System.out.println("Sons dos animais:");
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}