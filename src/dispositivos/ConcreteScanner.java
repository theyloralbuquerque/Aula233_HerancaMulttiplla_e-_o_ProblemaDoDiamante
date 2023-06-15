package dispositivos;

public class ConcreteScanner extends Dispositivo implements Scanner{

    public ConcreteScanner(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public void processarDoc(String doc) { // Subscreve o método abstrato processarDoc() da superclasse Dispositivo.
        System.out.println("Processando scanner: " + doc);
    }

    @Override
    public String scan() { // Subscreve a operação scan() da interface implementada.
        return "Conteúdo Scanneado!";
    }
}