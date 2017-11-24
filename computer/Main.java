

public class Main {



    public static void main(String args[]) {






         Dimensions dimensions= new Dimensions(20,20,5);

         Case theCase = new Case("220B","Dell","240",dimensions);

         Monitor theMonitor = new Monitor("27inch","Acer",27,new Resolution(2450,1440));

         Motherboaed themotherboard =new Motherboaed("BJ-200","Asus",4,6,"v2.44");

         PC thePC = new PC(theCase,theMonitor,themotherboard);

         thePC.getMonitor().drawPixelAt(1500,1200,"red");

         thePC.getMotherboaed().loadProgram("windows");

         thePC.getTheCase().pressPowerButton();


 




        }

      }

















