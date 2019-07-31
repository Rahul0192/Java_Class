public class Bangla {

    public Bangla(boolean beauty){
        System.out.println(beauty);
    }
    public static void main(String[]args){
        Bangla myLanguage=new Bangla(true);
        String continent,religion;
        continent="It is located in Asia";
        religion= "90% population are muslim";
        System.out.println(continent +religion);

        myLanguage.nice();

    }

    public void nice(){
        System.out.println("it is a nice country");
    }
}
