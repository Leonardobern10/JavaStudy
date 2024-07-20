package org.example;

public class CafeFacade {
    private final MoagemCafe moagemCafe;
    private final FerverAgua ferverAgua;
    private final PreparacaoCafe preparacaoCafe;

    public CafeFacade () {
        this.moagemCafe = new MoagemCafeImplements();
        this.ferverAgua = new FerverAguaImplements();
        this.preparacaoCafe = new PreparacaoCafeImplements();
    }

    public void fazerCafe () {
        moagemCafe.moerGraos();
        ferverAgua.ferver();
        preparacaoCafe.preparar();
        System.out.println("Seu café está pronto!");
    }
}
