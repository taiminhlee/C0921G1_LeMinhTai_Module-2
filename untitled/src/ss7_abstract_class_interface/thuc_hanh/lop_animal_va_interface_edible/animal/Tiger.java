package ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.animal;

import ss7_abstract_class_interface.thuc_hanh.lop_animal_va_interface_edible.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
