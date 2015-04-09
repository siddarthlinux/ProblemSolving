package in.linkedlist;

import in.linkedlist.bean.Node;

import java.io.IOException;
import java.util.Scanner;

public class CloningRandomPointerLinkedList {
	static Scanner sc=null;
	public static void main(String[] args) throws IOException{
		int numberOfNodes=0;
		//DataInputStream dis=new DataInputStream(System.in);
		Scanner sc=new Scanner(System.in);
		numberOfNodes=sc.nextInt();
		System.out.println("no of nodes-->"+numberOfNodes);
		Node rootNode=createLinkedList(numberOfNodes);
		System.out.println(rootNode);
		cloneLinkedList(rootNode);
		//printLinkedList(rootNode);
		//printLinkedList(cloneLinkedList(rootNode));
		
	}

	private static Node cloneLinkedList(Node rootNode) {
		Node duplicateList=null;
		if(rootNode==null){
			// TODO Auto-generated method stub
			//duplicateList=new Node(rootNode);	
		}
		else{
			duplicateList=new Node(rootNode);
			
		}
		return duplicateList;
	}

	private static void printLinkedList(Node rootNode) {
		// TODO Auto-generated method stub
		if(rootNode ==null){
			System.out.println("rootNode is null");
		}
		else{
			System.out.println();
			while(rootNode!=null){
				System.out.println("data:"+rootNode.data+"nextpointer"+(rootNode.next).data);
			}
		}
		
	}

	private static Node createLinkedList(int numberOfNodes) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		Node rootNode=null,node=null,nnode=null;
		for(int i=0;i<numberOfNodes;i++){
			System.out.println("Enter info of Node "+(i+1));
			System.out.println("Enter Data");
			if(rootNode==null){
				rootNode=new Node();
				System.out.println("Enter data:");
				rootNode.data=sc.nextInt();
				node=rootNode;
			}
			else{
				nnode=new Node();
				System.out.println("Enter data:");
				nnode.data=sc.nextInt();
				node.next=nnode;
				node=nnode;
			}
			
		}
		return rootNode;
	}
	

}
