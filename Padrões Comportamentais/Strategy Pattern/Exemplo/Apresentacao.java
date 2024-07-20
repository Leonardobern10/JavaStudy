package Exemplo;

public class Apresentacao extends Strategy{
    @Override
    public String fala() {
       return String.format("Olá, seja bem vindo!");
    }
}
