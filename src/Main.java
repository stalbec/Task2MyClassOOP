public class Main {
    public static void main(String[] args) {
      /*  MyClass деген класс тузунуз

        Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз,
        Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        Параметри эки башка болгон эки конструктор тузунуз

        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

        Эки объектке эки башка конструктор иштесин.

        Объекттердин маанилерин консольго чыгарыныз.*/


        MyClass myClass1 = new MyClass("Askar",25,new String[]  {"English",
                "Softskills","Java Core"});
        MyClass myClass2 = new MyClass("Alieva",23,"Manty");

        System.out.println(myClass1.firstName + " - " + myClass1.age + " - " + myClass1.toString());
        System.out.println(myClass2.lastNAme + " - " + myClass2.age + " - " + myClass2.myFavoriteMeal);
    }
}