/**
 * The Captain uses {@link RowingBoat} to sail. <br> This is the client in the pattern.
 */
public final class Captain {

    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row() {
        rowingBoat.row();
    }
}