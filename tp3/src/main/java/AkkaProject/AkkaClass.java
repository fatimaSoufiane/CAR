package AkkaProject;

import java.util.ArrayList;

import akka.actor.ActorRef;
import akka.actor.Props;

public class AkkaClass implements Akka {
	
	
	

    /*
     * choose the node for sending message 
     * or fixed the value in 1 to send from root
     */
	
	public AkkaClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void tellFromRoot(String msg) {
		// TODO Auto-generated method stub
		this.OnlyTell("1", msg);
		
	}
	@Override
	public void OnlyTell(String node, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message to send is  >>> " +msg+ " From this node >>>> "+node);
		//final ActorRef node=systeme.actorOf(Props.create(Nodes.class,1,couple),"node"+n);
		nodes.get(node).tell(msg, ActorRef.noSender());
		system1.shutdown();
	
		
	}


	/**
	 * 
	 */
	@Override
	public void DestributedTree() {
		// TODO Auto-generated method stub
				/**
				 * Create nodes of tree
				 */
				ActorRef a1 = system1.actorOf(Props.create(Nodes.class,"1",daddy));
				ActorRef a2 = system1.actorOf(Props.create(Nodes.class,"2",left));
				ActorRef a3 = system1.actorOf(Props.create(Nodes.class,"3",new ArrayList<ActorRef>()));
				ActorRef a4 = system1.actorOf(Props.create(Nodes.class,"4",new ArrayList<ActorRef>()));
				ActorRef a5 = system1.actorOf(Props.create(Nodes.class,"5",left));
				ActorRef a6 = system1.actorOf(Props.create(Nodes.class,"6",new ArrayList<ActorRef>()));

				/**
				 * defined the grand parent (daddy of children ) and the sons with add hem in arrayList 
				 */
				daddy.add(a2);
				daddy.add(a5);
				left.add(a3);
				left.add(a4);
				right.add(a6);

				/**
				 * add the values for each nodes of tree 
				 */
				nodes.put("1",a1);
				nodes.put("2",a2);
				nodes.put("3",a3);
				nodes.put("4",a4);
				nodes.put("5",a5);
				nodes.put("6",a6);




	}

	/**
	 * 
	 */
	@Override
	public void Tree() {
		// TODO Auto-generated method stub
		/**
		 * Create nodes of tree
		 */
		ActorRef a1 = system1.actorOf(Props.create(Nodes.class,"1",daddy));
		ActorRef a2 = system1.actorOf(Props.create(Nodes.class,"2",left));
		ActorRef a3 = system1.actorOf(Props.create(Nodes.class,"3",new ArrayList<ActorRef>()));
		ActorRef a4 = system1.actorOf(Props.create(Nodes.class,"4",new ArrayList<ActorRef>()));
		ActorRef a5 = system1.actorOf(Props.create(Nodes.class,"5",left));
		ActorRef a6 = system1.actorOf(Props.create(Nodes.class,"6",new ArrayList<ActorRef>()));

		/**
		 * defined the grand parent (daddy of children ) and the sons with add hem in arrayList 
		 */
		daddy.add(a2);
		daddy.add(a5);
		left.add(a3);
		left.add(a4);
		right.add(a6);

		/**
		 * add the values for each nodes of tree 
		 */
		nodes.put("1",a1);
		nodes.put("2",a2);
		nodes.put("3",a3);
		nodes.put("4",a4);
		nodes.put("5",a5);
		nodes.put("6",a6);



	}
	/**
	 * 
	 * 
	 */
	@Override
	public void Graph() {
		// TODO Auto-generated method stub

		/**
		 * Create nodes of tree and top of graph
		 */
		ActorRef a1 = system1.actorOf(Props.create(Nodes.class,"1",daddy));
		ActorRef a2 = system1.actorOf(Props.create(Nodes.class,"2",left));
		ActorRef a3 = system1.actorOf(Props.create(Nodes.class,"3",new ArrayList<ActorRef>()));
		ActorRef a4 = system1.actorOf(Props.create(Nodes.class,"4",top1));
		ActorRef a5 = system1.actorOf(Props.create(Nodes.class,"5",left));
		ActorRef a6 = system1.actorOf(Props.create(Nodes.class,"6",top2));



		/**
		 * defined the grand parent (daddy of children ) and the sons with add hem in arrayList 
		 */
		daddy.add(a2);
		daddy.add(a5);
		left.add(a3);
		left.add(a4);
		right.add(a6);
		top1.add(a6);

		/**
		 * add the values for each nodes of tree 
		 */
		nodes.put("1",a1);
		nodes.put("2",a2);
		nodes.put("3",a3);
		nodes.put("4",a4);
		nodes.put("5",a5);
		nodes.put("6",a6);


	}


	


}
