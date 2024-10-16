package MINI_APPLICATIONS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



public class logGenerator{
    public static String name="Dibyanshu Mishra";
    public static String title="DSTUM";
    public static Calendar cal = Calendar.getInstance();
    public static  List<String> dates=new ArrayList<>();
    public static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static String url;
    public static int myMonth=cal.get(Calendar.MONTH);

    public static void createFile(String url){
        String folderPath =  "E:\\DSTUM LOGS\\"+monthNames[myMonth];
        File file = new File(folderPath);
        Boolean folderTrue=file.mkdirs();
        file=new File(url);
        try {
            if ( folderTrue && file.createNewFile()) {
              System.out.println("File created: " + file.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
        public static void writeToFile(String url,String doc) {
          try {
            FileWriter myWriter = new FileWriter(url);
            myWriter.write("Name: "+name);
            myWriter.write("\nTitle: "+title);
            myWriter.write("\nDate Of Creation: "+doc);
            myWriter.write("\nDescription: \n\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }

    public static void main(String ... args){
 
        cal.set(Calendar.DAY_OF_MONTH, 1); 
     

        while (myMonth==cal.get(Calendar.MONTH)) {
        dates.add(cal.getTime().toString());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        dates.forEach(item->{
        if(!(item.toLowerCase().contains("sat") || item.toLowerCase().contains("sun"))){
            String month=monthNames[myMonth].substring(0, 3);
            url= "E:\\DSTUM LOGS\\"+monthNames[myMonth]+"\\"+item.split(month)[1].replaceAll(":","-").replace("IST", "-")+".txt";
 
            createFile(url);
            writeToFile(url,item);
        }
        });
        

        
    }
}


