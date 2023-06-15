package dispositivos;

public class ComboDeDispositivos extends Dispositivo implements Impressora, Scanner {

    public ComboDeDispositivos(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public String scan() { // Subscreve a operação scan() da interface implementada.
        return "Resultado do Scan do Combo";
    }

    @Override
    public void print(String doc) { // Subscreve a operação print() da interface implementada.
        System.out.println("Impressão do Combo: " + doc);
    }

    @Override
    public void processarDoc(String doc) { // Subscreve o método abstrato processarDoc() da superclasse Dispositivo.
        System.out.println("Processando Combo: " + doc);

    }

}