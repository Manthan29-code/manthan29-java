package abstopic.abstractionConcept.task1;

public class LmvVehicle extends Vehicle {
    public void getSpec()
    {
        // child Specification
        System.out.println("LmvVehicle()---> getSpec");

    }

    public void getLmvModelInfo()
    {
        System.out.println("LmvVehicle----getLmvModelInfo()----child method");
    }
}
