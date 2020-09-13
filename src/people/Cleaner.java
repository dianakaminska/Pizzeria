package people;

public final class Cleaner {
    final String nameOfCleaner;

    public Cleaner(String nameOfCleaner) {
        this.nameOfCleaner = nameOfCleaner;
    }

    public String cleaning(){
        return "\nCleaner " + nameOfCleaner + " is working now";
    }
}
