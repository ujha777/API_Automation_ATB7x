package test.java.thetestingacademy.sep052024;

public class BuilderPattern {

    public BuilderPattern groundFloor(){
        System.out.println("Ground Floor");
        return this;

    }
    public BuilderPattern firtFloor(){
        System.out.println("first Floor");
        return this;
    }

    public BuilderPattern secondFloor(){
        System.out.println("second Floor");
        return this;
    }
}
