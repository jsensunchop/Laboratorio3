public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription ( ) {
        return description;
    }
    public abstract double cost ( );
}
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription ( );
}


public class Coffe extends Beverage {
    public Coffe ( ) {
        description = "Coffe";
    }
    public double cost ( ) {
        return 1.99;
    }
}


public class WithMilk extends CondimentDecorator {
    Beverage beverage;
    public WithMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription ( ) {
        return beverage.getDescription( ) + ", With Milk";
    }
    public double cost ( ) {
        return .20 + beverage.cost ( );
    }
}


public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription ( ) {
        return beverage.getDescription( ) + ", With Mocha";
    }
    public double cost ( ) {    
        return .30 + beverage.cost ( );
    }
}


public class WithFigure extends CondimentDecorator {
    Beverage beverage;
    public WithFigure(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription ( ) {
        return beverage.getDescription( ) + ", WithFigure";
    }
    public double cost ( ) {    
        return .40 + beverage.cost ( );
    }
}

public class CTime extends CondimentDecorator {
    Beverage beverage;
    public CTime(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription ( ) {
        return beverage.getDescription( ) + " > 2 min cooked";
    }
    public double cost ( ) {
        return beverage.cost ( );
    }
}

public class TostaoCoffe {
public static void main (String args[]) {
    Beverage beverage = new Coffe ( );
    System.out.println ( beverage.getDescription ( ) + " $ "+ beverage.cost ( ));

    Beverage simple = new Coffe ( );
    System.out.println( simple.getDescription ( ) + " $ " + simple.cost ( ));

    Beverage elementary = new Coffe ( );
    elementary = new WithMilk(elementary);
    System.out.println( elementary.getDescription ( ) + "$ " + elementary.cost ( ));

    Beverage sophisticated = new Coffe ( );
    sophisticated = new WithMilk(sophisticated);
    sophisticated = new CTime(sophisticated);
    System.out.println( sophisticated.getDescription ( ) + "$ " + sophisticated.cost ( ));

    Beverage basic = new Coffe ( );
    basic = new CTime(basic);
    System.out.println( basic.getDescription ( ) + "$ " + basic.cost ( ));

    Beverage advanced = new Coffe ( );
    advanced = new WithMilk(advanced);
    advanced = new Mocha(advanced);
    advanced = new WithFigure(advanced);
    System.out.println( advanced.getDescription ( ) + "$ " + advanced.cost ( ));

    }
}