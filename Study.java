public class Study {

    public Study(int pen){
        System.out.println(pen);
    }

    public Study(float paper){
        System.out.println(paper);

    }

    public Study( String work_hard){
        System.out.println(work_hard);
    }
    public static void main(String[]args){

        Study myBook= new Study("you need study hard");
        String book="you need to read the book";
        System.out.println(book);
        Study myPen=new Study(3 );
        Study myPaper=new Study(4f);
    myBook.project();
    }
    public void project(){
        System.out.println("There is lots of project");

    }
}
