public class TwoDimArray{
    public static void main(String[] args){
      int[][] TwoDim = new int[6][8];
        int temp = 10;
          for(int i = 0; i < 6; i++){
             for(int j = 0; j < 8; j++){
                TwoDim[i][j] = temp;
                  temp += 10;
              }
          }
         for(int i = 0; i < 6; i++){
             for(int j = 0; j < 8; j++){
              System.out.print(TwoDim[i][j] + " "); 
              }
          }  
          System.out.println();
     } 
}

      
