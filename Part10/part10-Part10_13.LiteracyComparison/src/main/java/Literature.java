public class Literature implements Comparable<Literature>{
    
    private String gender;
    private String country;
    private int year;
    private double percentage;

    public Literature(String gender, String country, int year, double percentage) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return this.percentage;
    }

    @Override
    public int compareTo(Literature literature) {

        if (this.percentage > literature.percentage) {
            return 1;
        } else if (this.percentage < literature.percentage) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public String testing() {
        if (this.gender.contains("female")) {
            return "female";
        } else {
            return "male";
        }
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + testing() + ", " + this.percentage;
    }



}
