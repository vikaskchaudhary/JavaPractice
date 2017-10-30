package com.serialization.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExampleImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializationExample se=new SerializationExample();
		String filename="serialize.txt";
		se.setA(5);
		se.setB("B");
		se.k="12";
		try(FileOutputStream fos= new FileOutputStream(filename);ObjectOutputStream oos= new ObjectOutputStream(fos);){
			oos.writeObject(se);
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		
		SerializationExample  se1;
		 //filename="serialize.txt";
		try(FileInputStream fis= new FileInputStream(filename);ObjectInputStream ois= new ObjectInputStream(fis);){
			se1 = (SerializationExample) ois.readObject();
			System.out.println(se1.getA());
			System.out.println(se1.getB());
			System.out.println(se1.k);
			
		}catch(IOException ex){
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
