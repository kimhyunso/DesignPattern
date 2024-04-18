public class Waitress{
    private MenuComponent allMeuns;

    public Waitress(MenuComponent allMeuns){
        this.allMeuns = allMeuns;
    }

    public void printMenu(){
        allMeuns.print();
    }
}