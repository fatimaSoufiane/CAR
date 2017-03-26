package AkkaProject;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.Configuration;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

public class Nodes extends UntypedActor{


	public ArrayList<Integer> message;
	public ArrayList<ActorRef> son;
	String nodeName;
	public Map<Integer,ArrayList<Integer>> msgFils = new HashMap< Integer,ArrayList<Integer>>();
	public boolean isSend = false;
   


	ActorRef leftt;
	ActorRef rightt;


	public Nodes(String nodeName, ArrayList<ActorRef> son) {
		super();
		this.nodeName = nodeName;
		this.son = son;
	}




	@Override
	public void onReceive(Object arg0) throws Exception {
	
		// TODO Auto-generated method stub
		/* *** Just a print *** */
		System.out.println("Receiver is <<<< : "+this.getSelf().path().toStringWithoutAddress()+"<<<<<<<<");
		System.out.println("------------------------------------------------------------------------------");
		MessageToActor msg = null;
		
		isSend =false;
		
		if (arg0 instanceof String){
			/* recover my message*/
			msg= (MessageToActor) arg0;
			
			if (this.getSender()==null){
				 
				System.out.println("----------------je suis le père -------------");
			}else{
			
			
				System.out.println("------------------------------------------------------------------------------");

				System.out.println("Sender is >>>> "+this.getSender().path()+">>>>>>>>");
			}
			
		    System.out.println("The message send is : :"+msg+" reçu sur le "+this.nodeName);
		    if (leftt != null) {
				this.leftt.tell(message, this.getSelf()) ;
			}
			if (this.rightt != null) {
				this.rightt.tell(message, this.getSelf());
			}
		}
			
		    
			
			System.out.println("------------------------------------------------------------------------------");

		
			/*if (this.msgFils.containsKey(this.message)) {
				message = this.msgFils.get(this.son);
				for (int i = 0; i < son.size(); i++) {
					ActorRef fils = this.getContext().actorOf(Props.create(Nodes.class, message.get(i), this.msgFils),
							"NODE" +son.get(i));
					fils.tell(arg0, getSelf());
				}
			}
		}*/
		unhandled(arg0);
}





	public ArrayList<Integer> getMessage() {
		return message;
	}




	public void setMessage(ArrayList<Integer> message) {
		this.message = message;
	}




	public ArrayList<ActorRef> getSon() {
		return son;
	}




	public void setSon(ArrayList<ActorRef> son) {
		this.son = son;
	}




	public String getNodeName() {
		return nodeName;
	}




	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}




	public Map<Integer, ArrayList<Integer>> getMsgFils() {
		return msgFils;
	}




	public void setMsgFils(Map<Integer, ArrayList<Integer>> msgFils) {
		this.msgFils = msgFils;
	}
	 public ActorRef getLeftt() {
			return leftt;
		}




		public void setLeftt(ActorRef leftt) {
			this.leftt = leftt;
		}




		public ActorRef getRightt() {
			return rightt;
		}




		public void setRightt(ActorRef rightt) {
			this.rightt = rightt;
		}


	
}