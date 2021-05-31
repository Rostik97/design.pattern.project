package behavioral.template_method;

public abstract class Driver {

    public void driveCarTemplateMethod() {
        String licence = takeLicence();
        System.out.println("Take "+ licence + " to drive a vehicle...");
    }

    public abstract String takeLicence();

}
