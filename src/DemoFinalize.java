public class DemoFinalize {

    protected void finalize() throws Throwable {
        try {

            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {

            throw e;
        }
        finally {
            System.out.println("Calling finalize method"
                    + " of the Object class");
            super.finalize();
        }
    }

    // Driver code
    public static void main(String[] args) throws Throwable {
        DemoFinalize d = new DemoFinalize();
        d.finalize();
    }
}
