package Rascunho;

public class ConcreteBuilder implements Builder {

    Boneco boneco = null;

    public ConcreteBuilder () {
        boneco = new Boneco();
    }

    public void createHead() {
        System.out.println("A cabeça está sendo criada...");
    }

    public void createTronco() {
        System.out.println("O tronco está sendo criado...");
    }

    public void createBracos() {
        System.out.println("O braços estão sendo criados...");
    }

    public void createPernas() {
        System.out.println("As pernas estão sendo criadas...");
    }

    public Boneco createBoneco() {
        return boneco;
    }
}
