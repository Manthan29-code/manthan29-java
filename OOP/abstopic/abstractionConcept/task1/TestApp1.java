package abstopic.abstractionConcept.task1;
import java.util.Scanner;

public class TestApp1 {
    public static void getVehicleInfo(Vehicle vehicle){

        vehicle.getSpec();;

        if (vehicle instanceof TwVehicle){
            System.out.println("Hi I have TwVehicle Object");

            TwVehicle twVehicle = (TwVehicle)vehicle;// ClassCastException
			twVehicle.getTwModelInfo();// compiletime pass
        }else if(vehicle instanceof LmvVehicle) 
		{
			System.out.println("Hi I have LmvVehicle Object");

			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
			lmvVehicle.getLmvModelInfo();
			
		}else if(vehicle instanceof HmvVehicle) 
		{
			System.out.println("Hi I have HmvVehicle Object");
			
			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
			hmvVehicle.getHmvModelInfo();
		}


    }

    //	public static void getVehicleInfo(LmvVehicle lmvVehicle) 
//	{
//		lmvVehicle.getSpec();
//	}
//	
//	public static void getVehicleInfo(HmvVehicle hmvVehicle) 
//	{
//		hmvVehicle.getSpec();
//	}

      public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        // System.out.println("type of vehicle " + vehicle);
        // System.out.println("class of vehicle " + vehicle.getClass());
        // vehicle.getSpec();
        
        // Vehicle vehicle_2 = new TwVehicle();
        // System.out.println("type of vehicle_2 " + vehicle_2);
        // System.out.println("class of vehicle_2 " + vehicle_2.getClass());
        // vehicle_2.getSpec();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice of Vehicle");
        System.out.println("1) For Two Vehicle");
		System.out.println("2) For LightMotor Vehicle");
		System.out.println("3) For Heavy Motor Vehicle");
		int choice  =  sc.nextInt();

        switch(choice)
        {
            case 1:
                    TwVehicle tw=new TwVehicle();
                    getVehicleInfo(tw);

            break;
            case 2:
                    LmvVehicle lmv=new LmvVehicle();
                    getVehicleInfo(lmv);

            break;
            case 3:
                     HmvVehicle hmv = new HmvVehicle();
					getVehicleInfo(hmv);
			
                    break;
        }
        sc.close();

      }
}
