public class MyClass {
    String firstName;
    String lastNAme;
    int age;
    String myFavoriteMeal;
    String[] myLessons;

    public MyClass(String firstName, int age, String[] myLessons) {
        this.firstName = firstName;
        this.age = age;
        this.myLessons = myLessons;

    }
    public MyClass(String lastNAme,int age,String myFavoriteMeal) {
        this.lastNAme = lastNAme;
        this.age = age;
        this.myFavoriteMeal = myFavoriteMeal;
    }

    public MyClass() {

    }
}
