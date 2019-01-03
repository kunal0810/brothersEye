/*
 * To change this license header, choose License Headers in Project Properties.
 * To change 
template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avishkar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author rohit
 */
public class webtrending 

{ 
    
    
public static  void tcodechef() throws IOException, SQLException, IOException, IOException, IOException, ClassNotFoundException
    { System.out.println("cc");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
        Document doc = Jsoup.connect("https://www.codechef.com/contests").get();
        Elements temp = doc.select("tr");
        int i=1;
        for(Element abc:temp)
        {
            
           if(i==3||i==4||i==5){
               String str = abc.getElementsByTag("a").text();
          
        PreparedStatement stmt =  conn.prepareStatement("insert into tcodechef values(?)");
            stmt.setString(1,str);
           stmt.executeUpdate();}
    i++;
        }
        
    }
    
    
    public static void tspoj() throws IOException, SQLException, ClassNotFoundException
    { System.out.println("s");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
        Document doc = Jsoup.connect("https://www.spoj.com/contests/").get();
        Elements temp = doc.select("td");
        
        
  
        int i=1;
        int p=1;
        for(Element abc:temp)
        {if(i%3==1&&p<6)
        { String str = abc.getElementsByTag("a").text();
        PreparedStatement stmt =  conn.prepareStatement("insert into tspoj values(?)");
            stmt.setString(1,str);
            stmt.executeUpdate();
        p++;}
        i++;}
    }
    
    
    public static  void tcodeforces() throws IOException, SQLException, ClassNotFoundException
         { System.out.println("cf");
             Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
        Document doc = Jsoup.connect("http://codeforces.com/contests").get();
        Elements temp = doc.select("td");
        
        
  
        int i=1;
        int p=1;
        for(Element abc:temp)
        {if(i==1)
        { String str =  abc.getElementsByTag("td").text();
        PreparedStatement stmt =  conn.prepareStatement("insert into tcodeforces values(?)");
            stmt.setString(1,str);
            stmt.executeUpdate();
        }
        i++;
        }
    }
    
    
    public static  void thackerrank() throws IOException, ClassNotFoundException, SQLException
    {     System.out.println("hr");
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
        
        
        Document doc = Jsoup.connect("https://www.hackerrank.com/contests").get();
        Elements temp = doc.select("div");
        
        
  
        int i=1;
        int p=1;
        for(Element abc:temp)
        {if(i>38&&i<44)
        {String str = abc.getElementsByTag("div").text();
        PreparedStatement stmt =  conn.prepareStatement("insert into thackerrank values(?)");
            stmt.setString(1,str);
            stmt.executeUpdate();
        }
         i++;}
    
    }
    
    public webtrending(){
        try {
            tspoj(); 
            tcodechef();
         tcodeforces();
          thackerrank();
        
            
            
        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(webtrending.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
        
          
    
}