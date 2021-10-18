class Team{
    
    private String teamName;
    int[] name;
    
    
    
    public Team(String teamName, int name1, int name2, int name3, int name4){
        this.teamName = teamName;
        this.name = new int[4];
        name[0] = name1;
        name[1] = name2;
        name[2] = name3;
        name[3] = name4;
    }
    
    public void infoTeam(){
        System.out.println(teamName);
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
    public void showResults(Course course){
        for(int i = 0; i < name.length; i++){
            if(name[i] >= course.getAllLet()){
                System.out.println("participant " + name[i] + " do it");
            } else{
                System.out.println("participant " + name[i] + " could not do it");
            }
        }
    }
}
