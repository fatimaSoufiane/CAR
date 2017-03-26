package Question2;


import AkkaProject.AkkaClass;
/**
 * 
 * @author soufiane
 * Question2 : call from root with tellFromracine
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
		akka.tellFromRoot("hayy frome root");
		
		/*final ActorSystem systeme = ActorSystem.create("ApplicationAKKA");
				Map<Integer,ArrayList<Integer>> couple=new HashMap<Integer,ArrayList<Integer>>();

				ArrayList<Integer> node1 = new ArrayList<>(asList(2,5));
				couple.put(1,node1);

				ArrayList<Integer> node2 = new ArrayList<>(asList(3,4));
				couple.put(2, node2);

				ArrayList<Integer> node5 = new ArrayList<>(asList(6));
				couple.put(5, node5);

				final ActorRef node=systeme.actorOf(Props.create(Nodes.class,1,couple),"node1");
				node.tell("hayy!!!",node);
				systeme.shutdown();*/

		

	}



}
