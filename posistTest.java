import java.util.*;
import java.lang.*;
import java.io.*;

class genesis
{
	static final_int MAX_CHILD = 30;
	static int counter = 0;
	static long id = 99999999;


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}

	genesisNode createNewNode( genesisNode parent genesisNode gen string data)
	{    float sum = 0 ;
	     for ( int i = 0; i <numChild , i ++)
	     {
	     	sum = sum+ parent.childReferenceNodeId[i].data.value;
	     }
		genesisNode newNode = new genesisNode(data);
		parent.childReferenceNodeId{parent.numchild= newNode;
		parent.genesisReferenceNodeId= gen;
		return parent ;
	}


		genesisNode createNewgen( string data)
	{
		genesisNode newNode = new genesisNode();
		return newNode ;
	}

	// This is my class for the node structure and storing its value in this structured weay
	class genesisNode{

		Date timetsamp ;
		string data;
		int nodeNumber;
		string nodeId;
		genesisNode refrenceNodeId;
		genesisNode childReferenceNodeId;
		genesisNode genesisReferenceNodeId;
		string HashValue;
		int numchild;
		Node(String data)
		this.data= data;
		this.nodeId = genesis.id++;
		this. childReferenceNodeId = new genesisNode[genesis.MAX_CHILD];
		this.genesisReferenceNodeId = gen;
		this.nodeNumber = genesis.counter++;
		this.Hashvalue = "    ";
		this.timestamp= system.getCurrentTime;



	}
	 class data {
	 	 string myId;
	 	 float value;
	 	 string myNmae;
	 	 string hash;
	 	 //now encryption of the data will start.
	 	void encryptData(){
	 		this.myId = this.myId^key;
	 		this.value=this.value;
	 		this.myName = this.myName^this.key;
	 		this.hash= this.hash^this.key;

	 	}
	 	//as it is symetric encrption so keys will be same.
	 	void decryptData(){
	 			this.myId = this.myId^key;
	 		this.value=this.value;
	 		this.myName = this.myName^this.key;
	 		this.hash= this.hash^this.key;

	 	}
	 	 void getValue{
	 	 	if(isEcrptionCorrect)
	 	 	{
	 	 		return this.value^this.key;
	 	 	}
	 	 	else
	 	 	return float.parseFloat(this.value);


	 	 }
	 }
}
