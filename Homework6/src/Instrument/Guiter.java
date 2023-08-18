package Instrument;

public class Guiter implements Instrument{
    private int chordCount;

    public Guiter(int chordCount) {
        this.setChordCount(chordCount);
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + chordCount);
    }

    public int getChordCount() {
        return chordCount;
    }

    public void setChordCount(int chordCount) {
        if (chordCount < 3 || chordCount > 12) {
            System.out.println("Неверное количество струн");
        } else {
            this.chordCount = chordCount;
        }
    }
}
