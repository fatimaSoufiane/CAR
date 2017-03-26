package Question5;


import AkkaProject.AkkaClass;
/**
 * 
 * @author soufiane
 * Question5 : call from onlyTell or from Root 
 *
 */

public class MyMain   {

		/**
		 * 
		 * @param args
		*/
	     
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				
			     AkkaClass akka = new AkkaClass();
				 akka.Graph();
			     //akka.OnlyTell("1", "hayy from Graph");
			      akka.tellFromRoot("hayy from Graph");
				
			}
				
			

}
