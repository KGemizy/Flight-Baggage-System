import java.util.Scanner;
public class Flight
{
    public static void main(String[]args)
    {
        char passclass;
        double bagweight;
        double excessweight;
        int numofpassengers = 0,numofgroups=0;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of groups");
        numofgroups= input.nextInt();
        double grandTotalCharge = 0;


        for (int groupcounter=1; groupcounter<=numofgroups; groupcounter++)
        {
            System.out.println("Enter number of passengers for group no: "+groupcounter);
            numofpassengers = input.nextInt();
            double groupTotalCharge=0 ;

            for (int counter = 1; counter <= numofpassengers; counter++) {
                double charge = 0;
                System.out.println("Please Enter Passenger's Class for passenger no " + counter + " of group : " + groupcounter);
                passclass = input.next().charAt(0);
                System.out.println("Enter your bag weight");
                bagweight = input.nextDouble();

                switch (passclass) {
                    case 'F':
                        if (bagweight > 30) {
                            excessweight = bagweight - 30;
                            charge = excessweight * 10;
                        }
                        break;
                    case 'B':
                        if (bagweight > 25) {
                            excessweight = bagweight - 25;
                            charge = excessweight * 10;
                        }
                        break;
                    case 'E':
                        if (bagweight > 20) {
                            excessweight = bagweight - 20;
                            charge = excessweight * 10;
                        }
                        break;
                    default:
                        System.out.println("You entered Invalid class !");

                        groupTotalCharge += charge;
                        //System.out.println("You entered Invalid class !");
                }
                groupTotalCharge += charge;

                System.out.println("Passenger " + counter + " extra charge = " + charge);
            }
            System.out.println("Total extra charge for group " + groupcounter + " = " +groupTotalCharge);
            grandTotalCharge += groupTotalCharge;

        }
        System.out.println("Grand Total extra charge for all groups = " + grandTotalCharge);

        //System.out.println("You have to pay extra charge equal : " +charge);

    }
}
