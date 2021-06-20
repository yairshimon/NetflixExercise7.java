public class Series {
    private String nameOfSeries;
    private int severalEpisodes;
    private Episodes[] episodes;

    public Episodes[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episodes[] episodes) {
        this.episodes = episodes;
    }

    public String getNameOfSeries() {
        return nameOfSeries;
    }
    public void print() {
            System.out.println("this name of series is " + nameOfSeries + " number of episodes is " + this.severalEpisodes );
            for (int i = 0; i < this.episodes.length; i++) {
                System.out.println("Episodes " + i);
                this.episodes[i].print();
            }
    }
    public void setNameOfSeries(String nameOfSeries) {
        this.nameOfSeries = nameOfSeries;
    }

    public int getSeveralEpisodes() {
        return severalEpisodes;
    }

    public void setSeveralEpisodes(int severalEpisodes) {
        this.severalEpisodes = severalEpisodes;
    }
    public Series() {
        this.nameOfSeries = null;
        this.severalEpisodes= 0;
    }
    public Series(String nameOfSeries, int severalEpisodes,Episodes[] episodes) {
        this.nameOfSeries = nameOfSeries;
        this.severalEpisodes = severalEpisodes;
        this.episodes = episodes;
    }
}
