package decorator;
/**
 *
 * @author david
 */
public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
