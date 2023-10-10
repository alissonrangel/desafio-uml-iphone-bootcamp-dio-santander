package classes;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
}
