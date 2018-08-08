package dishes;
import java.util.Scanner;

import dishes.services.DishService;

public class Main {

	public static void main(String[] args) {
		String info = "Informe o período com o valor \"morning\" ou \"night\" e o número dos pratos separados por vírgula."
        		+ "\nOu informe \"S\" para parar os pedidos.";
		Scanner input = new Scanner(System.in);
		System.out.println(info);
	    boolean running = true;
	    while(running){
	    	String dish = input.nextLine().toString();
	    	System.out.println(dish);
	    	if(dish.contains("morning")) {
	    		System.out.println(DishService.montarRespostaMorning(dish)+"\n\n"+info);
	    	}else if(dish.contains("night")) {
	        	System.out.println(DishService.montarRespostaNight(dish)+"\n\n"+info);
	        }else if(input.toString().equalsIgnoreCase("s")) {
	        	running = false;
	        	break;
	        }
	    }
	    input.close();
	}

}
