package com.dbutil;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;


public class MongoConnection {
	private static MongoClient connection;
	
	public static MongoClient getMongoClientConnection() {
		if(connection == null) {
			//from default 27018 port
			//MongoClient mongoClient = MongoClients.create();
			connection = MongoClients.create();
		}
		return connection;
	}
	
	public static void close() {
		if(connection != null) {
			connection.close();
			connection = null;
		}
	}
}
