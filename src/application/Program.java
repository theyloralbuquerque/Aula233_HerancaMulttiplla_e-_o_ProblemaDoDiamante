package application;

import dispositivos.ComboDeDispositivos;
import dispositivos.ConcreteImpressora;
import dispositivos.ConcreteScanner;

public class Program {

    public static void main(String[] args) {

        ConcreteImpressora i = new ConcreteImpressora("1080");
        i.processarDoc("Minha Carta");
        i.print("Minha Carta");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processarDoc("Meu Email");
        System.out.println("Resultado do Scaneamento: " + s.scan());

        System.out.println();
        ComboDeDispositivos c = new ComboDeDispositivos("2081");
        c.processarDoc("Minha Dissertação");
        c.print("Minha Dissertação");
        System.out.println("Resultado do Scan: " + c.scan());
    }
}