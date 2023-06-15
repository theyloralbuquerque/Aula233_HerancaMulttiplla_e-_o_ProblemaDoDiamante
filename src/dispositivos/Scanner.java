package dispositivos;

public class Scanner extends Dispositivo {

    public Scanner(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public void processarDoc(String doc) {
        System.out.println("Processando scanner: " + doc);
    }

    public String scan() {
        return "Conteúdo Scanneado!";
    }
}
