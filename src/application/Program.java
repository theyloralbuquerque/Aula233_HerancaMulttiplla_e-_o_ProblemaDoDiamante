package application;

import dispositivos.Impressora;
import dispositivos.Scanner;

public class Program {

    public static void main(String[] args) {

        Impressora imp = new Impressora("1080");
        imp.processarDoc("Minha Carta");
        imp.print("Minha Carta");

        Scanner s = new Scanner("2003");
        s.processarDoc("Meu Email");
        System.out.println("Resultado do Scaneamento: " + s.scan());
    }
}
