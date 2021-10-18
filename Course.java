class Course{
    
    int[] let;
    int allLet = 0;
    
    public Course(int let1, int let2){
        this.let = new int[2];
        let[0] = let1;
        let[1] = let2;
    }
    
    public void doIt(){
        for(int i = 0; i < let.length; i++){
            allLet += let[i];
        }
    }
    
    public int getAllLet(){
        return allLet;
    }
}
