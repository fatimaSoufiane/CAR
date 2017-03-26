package AkkaProject;

import java.util.ArrayList;
import java.util.HashMap;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public interface Akka {

	HashMap <String,ActorRef> nodes = new HashMap<String,ActorRef>();
	final ActorSystem system1 =ActorSystem.create("SystemnumberOne");
	final ActorSystem system2 =ActorSystem.create("SystemnumberTwo");
	
	
	ArrayList<ActorRef> daddy = new ArrayList<ActorRef>();
	ArrayList<ActorRef> left = new ArrayList<ActorRef>();
	ArrayList<ActorRef> right = new ArrayList<ActorRef>();
	ArrayList<ActorRef> top1 = new ArrayList<ActorRef>();
	ArrayList<ActorRef> top2 = new ArrayList<ActorRef>();
    

	public void DestributedTree();
	public void Tree();
	public void Graph();
	public void tellFromRoot(String msg);
	public void OnlyTell(String node , String msg);

}
