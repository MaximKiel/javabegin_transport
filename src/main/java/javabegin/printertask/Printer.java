package javabegin.printertask;

public class Printer implements InterfacePrinter {

    private int paintVolume;

    public Printer() {
    }

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public int getPaintVolume() {
        return paintVolume;
    }

    @Override
    public void print(String massage) {
        int length = massage.length();
        System.out.println("На печать отправлен текст: " + massage + ", длина: " + length);

        if (length > paintVolume) {
            System.out.println("Не хватило краски: " + (length - paintVolume) + " (всего краски в принтере " + paintVolume + ")");
        } else {
            this.paintVolume -= length;
            System.out.println("Текст распечатан: " + massage + ", у принтера осталось краски: " + paintVolume);
        }
    }

    @Override
    public void charge(int value) {
        this.paintVolume += value;
        System.out.println("Принтер пополнен на длину текста " + value + " (всего краски в принтере: " + paintVolume + ")");
    }
}