package CE039_Polymorphism;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
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
