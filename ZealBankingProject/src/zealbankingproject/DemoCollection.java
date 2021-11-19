/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zealbankingproject;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoCollection {
    public static void main(String []args)
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String name="";
        
     //  while(!name.equals("stop"))
      // {
                                                    try {
            
            name = br.readLine();
                                                    
        
        name=name+name;
        System.out.println(name);
     //  }
       int a=Integer.parseInt(name);
       a=a+a;
        System.out.println(a);
        br.close();
                                                         } catch (IOException ex) {
                                                        Logger.getLogger(DemoCollection.class.getName()).log(Level.SEVERE, null, ex);
                                                                 }
    }
}
