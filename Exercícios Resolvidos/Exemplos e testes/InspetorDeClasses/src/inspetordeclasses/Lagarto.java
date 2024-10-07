package inspetordeclasses;

/**
 *
 * @author danielp6r
 */
public class Lagarto extends Reptil{
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo tudo que encontra...");
    }
}
