import java.util.*; 


class Hello{
    public static void main(String[] args){
        
        boolean[][] board = {{true , true , true},
                            { true, true , true},
                            { true , true , true }}; 
        
        path("" , 0, 0 , board); 
        
    }
    
    static void path(String s, int r , int c , boolean [][]maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(s); 
            return ; 
            
        }
        
        if( !maze[r][c]){
            return ; 
        }
        
        maze[r][c] = false ; 
       
        if(r < maze.length-1){
            path(s+'R' , r+1, c , maze);
        }
         if(r >0){
            path(s+'U' , r-1, c , maze);
        }
        if( c<  maze[0].length-1){
            path(s+'D' , r, c+1 , maze); 
        }
        if( c>0){
            path(s+'L' , r, c-1 , maze); 
        }
        
        maze[r][c] = true; 
    }
}
