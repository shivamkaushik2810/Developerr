public class SolidSqrPtnRec{
    static void printCol(int colCount){
        if(colCount<=0){
            return;
        }
        System.out.print("*");
        printCol(colCount-1);
    }
       static void printRow(int rowCount,int colCount){
        if(rowCount<=0){
            return;
        }

        printCol(colCount);
        System.out.println();
        printRow(rowCount-1,colCount);
    }
    
    public static void main(String[] args) {
        SolidSqrPtnRec.printRow(100,50);

        
    }
}