public class AllSeries {
    private final Series[] series = new Series[Main.MAX_SERIES];

    public int searchSeries (String nameOfSeries) {
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i].getNameOfSeries().equals(nameOfSeries)) {
                return i;
            }
        }
        return -2;
    }
    public void add(Series series) {
        for (int i = 0; i <= this.series.length; i++) {
            if (this.series[i] == null) {
                this.series[i] = series;
                return;
            }

        }
        System.out.println("NO MORE PLACE FOR SERIES");
    }

    public boolean checkEmpty(int index) {
        return this.series[index] == null;
    }

    public void print() {
        for (int i = 0; i <= this.series.length - 1; i++) {
            if (this.series[i] != null) {
                series[i].print();
            }
        }
    }

    public void print(int index) {
        series[index].print();
    }
}
