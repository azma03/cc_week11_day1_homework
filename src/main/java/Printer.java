public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int printLoad = numberOfPages * numberOfCopies;
        if(this.sheetsOfPaper >= printLoad && this.tonerVolume>= printLoad){
            this.sheetsOfPaper -= printLoad;   //reduce paper
            this.tonerVolume -= printLoad;     //reduce toner
        }
    }

    public void refill(int newSheetsOfPaper){
        this.sheetsOfPaper += newSheetsOfPaper;
    }
}
