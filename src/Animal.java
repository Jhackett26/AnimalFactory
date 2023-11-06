public class Animal {

    //var declarations
    public boolean hasFur;
    public String size;
    public int numLegs;

    public Animal(boolean paramFur, String paramSize, int paramLegs){
        hasFur = paramFur;
        size = paramSize;
        numLegs = paramLegs;

    }
    public void printInfo(){
        System.out.println(hasFur);
        System.out.println(size);
        System.out.println(numLegs);
    }

}
