import java.util.*; 

class Hello{
    public static void main(String[] args){
        int[][] matrix = {
                            {1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25},
                            {26,27,28,29,30}
                            
                        };
        System.out.print(print_matrix(matrix)); 
                        
    }
    static ArrayList<Integer> print_matrix(int[][] m){
        ArrayList<Integer> list = new ArrayList<>(); 
        
        int start_col = 0; 
        int end_col = m[0].length-1; 
        int start_row =0 ; 
        int end_row = m.length-1; 
        
        if(m.length == 0) return list; 
        
        while(start_row <= end_row && start_col <= end_col){
            for(int i= start_col ; i<=end_col ; i++){
                list.add(m[start_row][i]); 
            }
            
            start_row++; 
            
            for(int i= start_row ; i<=end_row ; i++){
                list.add(m[i][end_col]); 
            }
            
            end_col--; 
            
            for(int i= end_col ; i>=start_col ; i--){
                list.add(m[end_row][i]); 
            }
            
            end_row--; 
            
            for(int i=end_row; i>=start_row ; i--){
                list.add(m[i][start_col]); 
            }
            
            start_col++; 
        }
        return list; 
        
        
    }
}
