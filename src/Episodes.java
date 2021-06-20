public  class Episodes {
    private String name;
    private int number;
    private String brief;
    private String dateOfAiring;

    public Episodes(String name, int number, String brief, String dateOfAiring) {
        this.name = name;
        this.number = number;
        this.brief = brief;
        this.dateOfAiring = dateOfAiring;
    }
    public void print() {
        System.out.println("The name of the episode is: " + this.name + " \nthe date of the broadcast: " + this.dateOfAiring + " \nthe summary of the episode is : \n" + this.brief);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDateOfAiring() {
        return dateOfAiring;
    }

    public void setDateOfAiring(String dateOfAiring) {
        this.dateOfAiring = dateOfAiring;
    }
}
