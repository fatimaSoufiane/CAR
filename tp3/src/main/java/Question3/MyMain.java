package Question3;

import AkkaProject.AkkaClass;
/**
 * 
 * @author soufiane
 * Question 3 : call from any selected nodes 
 *
 */

public class MyMain {
   
		/**
		 * @param args
		*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				
			  AkkaClass  akka  = new AkkaClass();
		      akka.Tree();
		      akka.OnlyTell("2","hayy frome root");
				/*ArrayList<Integer> node1 = new ArrayList<>(asList(2,5));
				couple.put(1,node1);
				
				ArrayList<Integer> node2 = new ArrayList<>(asList(3,4));
				couple.put(2, node2);
				
				ArrayList<Integer> node5 = new ArrayList<>(asList(6));
				couple.put(5, node5);
				envoyer("4", "hayy!!");
				
				
				
			
			

		//methode pour envoyer un message a partir d'un noeud choisi
		public static void envoyer(String n,String msg) {
			System.out.println("message >>> "+""+msg+"de la part de "+n);
			//ActorRef node;
			final ActorRef node=systeme.actorOf(Props.create(Nodes.class,1,couple),"node"+n);
			node.tell(msg, ActorRef.noSender());
			systeme.shutdown();
		}
*/
}}
