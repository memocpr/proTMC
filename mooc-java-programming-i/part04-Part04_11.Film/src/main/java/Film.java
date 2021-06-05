public class Film {
    private String name;
    private int age;

    public Film(String filmName, int filmAgeRating){
        this.name=filmName;
        this.age=filmAgeRating;
    }

    public String name(){
        return this.name;
    }

    public int ageRating(){
        return this.age;
    }
}
