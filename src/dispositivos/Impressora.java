package dispositivos;

public class Impressora extends Dispositivo{

    public Impressora(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public void processarDoc(String doc) {
        System.out.println("Processando impressora: " + doc);
    }

    public void print(String doc) {
        System.out.println("Impressão: " + doc);
    }

}