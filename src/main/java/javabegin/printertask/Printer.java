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
        String result = String.format("На печать отправлен текст: %s, длина: %d", massage, length);
        System.out.println(result);

        if (length > paintVolume) {
            result = String.format("Не хватило краски: %d (всего краски в принтере %d)", (length - paintVolume), paintVolume);
        } else {
            this.paintVolume -= length;
            result = String.format("Текст распечатан: %s, у принтера осталось краски: %d", massage, paintVolume);
        }
        System.out.println(result);
    }

    @Override
    public void charge(int value) {
        this.paintVolume += value;
        String result = String.format("Принтер пополнен на длину текста %d (всего краски в принтере: %d)", value, paintVolume);
        System.out.println(result);
    }
}