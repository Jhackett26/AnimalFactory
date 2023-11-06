public class Main {
    public static void main(String[] args) {
        Main myFactory =new Main();
    }
    public Main(){

        Animal cat;
        cat = new Animal(true, "small",4);
        cat.printInfo();

        System.out.println(' ');
        Animal dog;
        cat = new Animal(true,"medium/large",4);
        cat.printInfo();

    }
}