package com.sunny;

import com.sunny.SerializeDataFrom;
import java.io.*;


public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeDataFrom SDF = new SerializeDataFrom("Vasu", 6767, "desai@vasudev.com");
        File fileinfo = new File("/Users/sunny/IdeaProjects/SunnyPractice/JanPrac/src/com/SampleTextFile/SeriallizeFile.bin");
        new SerializationDemo().serialize(fileinfo, SDF);
        new SerializationDemo().deSerialize(fileinfo);
    }

    private SerializationDemo serialize(File file, SerializeDataFrom instanceOfFile ) throws IOException {

        FileOutputStream fileStream= new FileOutputStream(file);
        ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
        // ObjectOutputStream objStream1 = new ObjectOutputStream(new FileOutputStream(file));
        objStream.writeObject(instanceOfFile);
        objStream.flush();
        objStream.close();
        return null;
    }
    
    private SerializationDemo deSerialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializeDataFrom SDF1 = (SerializeDataFrom) objectInputStream.readObject();
        System.out.println("" + SDF1.name);
        System.out.println("" + SDF1.id);
        System.out.println("" + SDF1.email);
        return null;
    }
}
