class Animal{

    void fazerSom(){
        System.out.println("Fazendo som genérico");
    }

}

class Cachorro extends Animal{
    @Override
    void fazerSom(){
        System.out.println("Au! Au!");
    }
}



public class Heranca {
    public static void main(String[] args) throws Exception {
        // Cria a instancia cachorro
        Cachorro meuCachorro = new Cachorro();
        Animal gato = new Animal();

        meuCachorro.fazerSom();
        gato.fazerSom();
    }
}
