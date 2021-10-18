/**
Java 2 Home Work 1
@author Egor Butenko
@version 19.10.2021
*/
class Main{
    
    public static void main(String[] args){
        Course course = new Course(1, 2);
        Team team = new Team("Losers", 1, 2, 3, 4);
        team.infoTeam();
        course.doIt();
        team.showResults(course);
    }
}
