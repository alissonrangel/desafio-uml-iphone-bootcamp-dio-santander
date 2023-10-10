package classes;

import interfaces.AparelhoFotografico;

public class CameraDigital implements AparelhoFotografico {
    @Override
    public void tirarFoto() {
        System.out.println("Tirar Foto");
    }

    @Override
    public void verFoto() {
        System.out.println("Ver Foto");
    }

    @Override
    public void darUmZoom() {
        System.out.println("Dar um zoom na foto");
    }
}
