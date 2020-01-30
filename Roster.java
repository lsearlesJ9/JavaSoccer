public class Roster{

    public static void main(String args[]){

        //create objects
        //DataType nameObj = new DataType();

        SoccerPlayer p1 = new SoccerPlayer();
        p1.name = "Cristiano Ronaldo";
        p1.age = 34;
        p1.nationality = "Portugal";
        p1.salary = 3100000.00;
        p1.number = 7;
        System.out.println(p1.name + " " + p1.age + " " + p1.nationality + " " + p1.salary + " " + p1.number);

        SoccerPlayer p2 = new SoccerPlayer();
        p2.name = "Gareth Bale";
        p2.age = 30;
        p2.nationality = "Wales";
        p2.salary = 1500000.00;
        p2.number = 11;
        System.out.println(p2.name + " " + p2.age + " " + p2.nationality + " " + p2.salary + " " + p2.number);

        SoccerPlayer p3 = new SoccerPlayer();
        p3.name = "Fernando Torres";
        p3.age = 35;
        p3.nationality = "Spain";
        p3.salary = 1000000.00;
        p3.number = 9;
        
        System.out.println(p3.name + " " + p3.age + " " + p3.nationality + " " + p3.salary + " " + p3.number);
    }
}