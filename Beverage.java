
/**
 * Write a description of class Beverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beverage
{
    public enum Size{LARGE, MEDIUM, SMALL}
    
    private String name;
    private double price;
    private Size size;
    
    
    

    /**
     * Constructor for objects of class Beverage
     * input parameters int and int 
     * 
     */
    public Beverage(int name, int size)
    {
        // initialise instance variables
        this.name = findName(name);
        this.size = findSize(size);
        //this.size = size;
        price = findPrice(this.name,this.size);
    }
    
    /**
     * find the size of the coffee ordered by the customer depending on the int choices 
     * input parameter int 
     * returns Size
     * 
     */
    public Size findSize(int size){
        if(size==1){return Size.SMALL;}
        if (size==2){return Size.MEDIUM;}
        if(size==3){return Size.LARGE;}
        return null;
    
    }
    /**
     * finds the name of the coffee choices input by the user 
     * input parameters int type
     *returns String type
     */
    public String findName(int name){
        if(name==1){return "Coffee";}
        if(name==2){return "Cappuccino";}
        if(name==3){return "Mocha";}
        if(name==4){return "IcedTea";}
        if(name==5){return "ChaiLatte";}
        return null;
    }
     /**
      * getter for the name of the item 
      * returns String type 
      */
    public String getName(){
        
         return this.name;
        

    
    
    }
    /**
     * getter for the size of the item 
     */
    public Size getSize(){
        
        return this.size;
    }
    /**
     * getter for the price for the item
     * returns double type
     */
    public double getPrice(){
        return price;
    }
    /**
     * method to find price depending on the price and the size 
     * input parameters String type and Size type 
     * returns double 
     */
    public double findPrice(String name, Size size){
        double baseCoffee = 2.0;
        double baseCappuccino = 3.0;
        double baseMocha = 4.0;
        double baseIcedTea = 3.5;
        double baseChaiLatte = 4.5;
        if (name.equals("Coffee") && size == Size.MEDIUM){
            price = baseCoffee;
            
        }else if (name.equals("Coffee") && size == Size.SMALL){
            price = baseCoffee * 0.8;
        }else if(name.equals("Coffee") && size == Size.LARGE){
            price = baseCoffee * 1.2;
        }
       
        if (name.equals("Cappuccino") && size == Size.MEDIUM){
            price = baseCappuccino;
            
        }else if (name.equals("Cappuccino") && size == Size.SMALL){
            price = baseCappuccino * 0.8;
        }else if(name.equals("Cappuccino") && size == Size.LARGE){
            price = baseCappuccino * 1.2;
        }
        if (name.equals("Mocha") && size == Size.MEDIUM){
            price = baseMocha;
            
        }else if (name.equals("Mocha") && size == Size.SMALL){
            price = baseMocha * 0.8;
        }else if(name.equals("Mocha") && size == Size.LARGE){
            price = baseMocha * 1.2;
        }
        if (name.equals("IcedTea") && size == Size.MEDIUM){
            price = baseIcedTea;
            
        }else if (name.equals("IcedTea") && size == Size.SMALL){
            price = baseIcedTea * 0.8;
        }else if(name.equals("IcedTea") && size == Size.LARGE){
            price = baseIcedTea * 1.2;
        }
        if (name.equals("ChaiLatte") && size == Size.MEDIUM){
            price = baseChaiLatte ;
            
        }else if (name.equals("ChaiLatte") && size == Size.SMALL){
            price = baseChaiLatte  * 0.8;
        }else if(name.equals("ChaiLatte") && size == Size.LARGE){
            price = baseChaiLatte  * 1.2;
        }
        return price;
    }
    
}
       
    


