package dispositivos;

public class ConcreteImpressora extends Dispositivo implements Impressora {
    public ConcreteImpressora(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public void processarDoc(String doc) { // Subscreve o método abstrato processarDoc() da superclasse Dispositivo.
        System.out.println("Processando impressora: " + doc);
    }

    @Override
    public void print(String doc) { // Subscreve a operação print() da interface implementada.
        System.out.println("Impressão: " + doc);
    }

}