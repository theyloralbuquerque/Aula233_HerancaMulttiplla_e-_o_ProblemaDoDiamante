package dispositivos;

public class ConcreteScanner extends Dispositivo implements Scanner{

    public ConcreteScanner(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public void processarDoc(String doc) { // Subscreve o m�todo abstrato processarDoc() da superclasse Dispositivo.
        System.out.println("Processando scanner: " + doc);
    }

    @Override
    public String scan() { // Subscreve a opera��o scan() da interface implementada.
        return "Conte�do Scanneado!";
    }
}