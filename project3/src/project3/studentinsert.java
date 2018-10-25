package project3;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class studentinsert {

	public static void main(String[] args) {
		
				 MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
				 
				 System.out.println("Connected to the database successfully"); 
				 
				// Accessing the database 
			      MongoDatabase database = mongo.getDatabase("school"); 

			      // Retrieving a collection
			      MongoCollection<Document> collection = database.getCollection("students"); 
			      System.out.println("Collection sampleCollection selected successfully");

			      Document document = new Document("title", "studentchart") 
				 
				 
				 
				 
			    		  .append("Student No", 7)
			    	      .append("FirstName", "Manisha") 
			    	      .append("LastName", "Bhattachariya") 
			    	      .append("Age",  23) ;
			    	      
			    	      collection.insertOne(document); 
			    	      System.out.println("Document inserted successfully");     
			    	   } 
			    	
				 
					

}
