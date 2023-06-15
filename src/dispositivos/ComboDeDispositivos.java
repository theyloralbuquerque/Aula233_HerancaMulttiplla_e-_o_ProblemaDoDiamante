package dispositivos;

public class ComboDeDispositivos extends Dispositivo implements Impressora, Scanner {

    public ComboDeDispositivos(String numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public String scan() { // Subscreve a opera��o scan() da interface implementada.
        return "Resultado do Scan do Combo";
    }

    @Override
    public void print(String doc) { // Subscreve a opera��o print() da interface implementada.
        System.out.println("Impress�o do Combo: " + doc);
    }

    @Override
    public void processarDoc(String doc) { // Subscreve o m�todo abstrato processarDoc() da superclasse Dispositivo.
        System.out.println("Processando Combo: " + doc);

    }

}