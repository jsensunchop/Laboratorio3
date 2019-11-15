import java.io.BufferedReader;

public interface Strategy {
   public int toAirport(int money, int time);
}

public class toAirportBike implements Strategy{
   @Override
   public int toAirport(int money, int time) {
      money=0;
      time=time*3;
      return money;
      return time;
   }
}

public class toAirportBus implements Strategy{
   @Override
   public int toAirport(int money, int time) {
      money = money*2;
      time = time*2;
      return money;
      return time;
   }
}

public class toAirportCab implements Strategy{
   @Override
   public int toAirport(int money, int time) {
      money= money*3;
      return money;
      return time;
   }
}


public class Context {
    private Strategy strategy;
 
    public Context(Strategy strategy){
       this.strategy = strategy;
    }
 
    public int executeStrategy(int money, int time){
       return strategy.toAirport(money, time);
    }
 }


 public class StrategyPatternDemo {
    public static void main(String[] args) {

        System.out.println("Please select the most suitable way to go to the airport");
        
        System.out.println("Let's Start, please select your transport\n1: Bike\n 2:Bus\n 3:Cab");

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        if (Integer.parseInt(br.readLine())==1){
            int money=0;
            int time=30;
            Context context = new Context(new toAirportBike());		
            System.out.println("Your bicycle trip will cost you " + context.executeStrategy(money, time));
 
        }
        else if(Integer.parseInt(br.readLine())==2){
            int money = 20;
            int time = 30;
            context = new Context(new toAirportBus());		
            System.out.println("Your bus trip will cost you " + context.executeStrategy(money, time));
        }
        else if(Integer.parseInt(br.readLine())==3){
            int money =20;
            int time=30;
            context = new Context(new toAirportCab());		
            System.out.println("Your cab trip will cost you " + context.executeStrategy(money, time));
        }
        
       
 
       
    }
 }