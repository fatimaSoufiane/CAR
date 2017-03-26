package Question4;


import AkkaProject.AkkaClass;
/**
 * 
 * @author soufiane
 * Question4 : call the DestributedTree from Root 
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
				 akka.DestributedTree();
			     akka.tellFromRoot("hayy from this one");
				
				
			}
				
			

}
