package PROJECT;
import java.util.*;

class SportsPerson {
    protected String name; 
    protected String nationality;
    public int count;
    
    public SportsPerson()
    { 
    
    }
    
    public SportsPerson(String name, String nationality)
    {
        this.name = name;
        this.nationality = nationality;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
        count++;                    //counter is incremented to check if no of playrs required to start the match criteria is fulfilled
    }
    
    public String getNationality()
    {
        return nationality;
    }
    
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    
    public String toString()
    {
        return ("\nName: " + getName() + "\nNationality: " + getNationality());
    }
}



class Footballer extends SportsPerson {
    protected int jerseyNo;
    Team team;
    
    public Footballer()
    {  
        
    }
    
    public Footballer(String name, String nationality, int jerseyNo)
    {
        super(name, nationality);
        this.jerseyNo = jerseyNo;
        this.team = new Team(11, "Football Club of Barcelona", "Camp Nou");
    }
    
    public void setJerseyNo(int jerseyNo)
    {
        this.jerseyNo = jerseyNo;
    }
    
    public int getJerseyNo()
    {
        return jerseyNo;
    }
    
    public void displayDetails()
    {
        System.out.println(super.toString());
        System.out.println("Jersey Number: " + getJerseyNo());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Stadium Name: " + team.getStadiumName());
    }
    
    
    public void startMatch()
    {
        if(count>=2)                //If count >= 2 i.e. if there are 3 players or more only then will the game start.
        {
            this.team.Match();
        }
        else                        //If there still aren't enough players then print the below statement
        {
            System.out.print("We dont have enough players to play the match.\n\n");
        }
    }
}



class Team {
    protected int noOfPlayers;
    protected String teamName;
    protected String stadiumName;
    
    
    public Team()
    { 
    }
    
    public Team(int noOfPlayers, String teamName, String stadiumName)
    { 
        this.noOfPlayers = noOfPlayers;
        this.teamName = teamName;
        this.stadiumName = stadiumName;
    }
    
    public String getTeamName()
    {
        return teamName;
    }
    
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }     
    
    public String getStadiumName()
    {
        return stadiumName;
    }
    
    public void setStadiumName(String stadiumName)
    {
        this.stadiumName = stadiumName;
    }
    
    public void Match()
    {
            System.out.print("The match is played by " + getTeamName() + " at " + getStadiumName() + ".\n\n");   
    }
    
}



public class Game {

    public static void main(String[] args) {
        Footballer f = new Footballer("Messi", "Argentina", 10);
        f.displayDetails();
        f.startMatch();
        
        f.setName("Devarsh");
        f.setNationality("India");
        f.setJerseyNo(11);
        f.displayDetails();
        f.startMatch();
        
        f.setName("Neymar");
        f.setNationality("Brazil");
        f.setJerseyNo(9);
        f.displayDetails();
        f.startMatch();
    }
    
}
