package javabegin;

import javabegin.printertask.InterfacePrinter;
import javabegin.printertask.Printer;

public class Main {

    public static void main(String[] args) {
        InterfacePrinter printer = new Printer(10);
        printer.print("Hello world");
        printer.charge(5);
        printer.print("Hello world");
    }
}