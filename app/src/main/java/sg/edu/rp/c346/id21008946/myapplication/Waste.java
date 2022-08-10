package sg.edu.rp.c346.id21008946.myapplication;

public class Waste {

    private int year;
    private String waste_type;
    private int recycling_rate;

    public Waste(int year, String waste_type, int recycling_rate) {
        this.year = year;
        this.waste_type = waste_type;
        this.recycling_rate = recycling_rate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWaste_type() {
        return waste_type;
    }

    public void setWaste_type(String waste_type) {
        this.waste_type = waste_type;
    }

    public int getRecycling_rate() {
        return recycling_rate;
    }

    public void setRecycling_rate(int recycling_rate) {
        this.recycling_rate = recycling_rate;
    }
}
