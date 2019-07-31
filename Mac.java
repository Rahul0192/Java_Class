public class Mac {

    public Mac(String red) {
        System.out.println(red);
    }


    public static void main(String[] args) {
        Mac myMac = new Mac("color");
        String core, ram;
        core = "Core I7";
        ram = " 16gb ram ";
        System.out.println(core + ram);
        myMac.log();

    }

    public void log() {
        System.out.println("it is not window type ");


    }



}
