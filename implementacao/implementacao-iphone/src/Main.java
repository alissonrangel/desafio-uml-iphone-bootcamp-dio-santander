import classes.Iphone;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var iphone = new Iphone();
        System.out.println("###### Reprodutor Musical ######");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("###### ###### ###### ###### ######\n");
        System.out.println("###### Aparelho Telefônico ######");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.enviarMensagemDeTexto();
        iphone.lerMensagemDeTexto();
        System.out.println("###### ###### ###### ###### ######\n");
        System.out.println("###### Aparelho Fotográfico ######");
        iphone.tirarFoto();
        iphone.verFoto();
        iphone.darUmZoom();
        System.out.println("###### ###### ###### ###### ######\n");
        System.out.println("###### Navegador na Internet ######");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.removerAba();
        iphone.atualizarPagina();
        System.out.println("###### ###### ###### ###### ######");
    }
}