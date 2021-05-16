package CE039_Polymorphism;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " -> start engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}
