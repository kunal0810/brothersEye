
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

public class web extends Thread
{   public String spojhandle,cfhandle,cchandle,useremail ;
    public web(String a,String b,String c,String d){
        spojhandle=a;
        cfhandle=b;
        cchandle=c;
        useremail=d;
        
    }
    /**
     *
     * @param username
     * @return
     * @throws IOException
     */
    public String codechef() throws IOException{
        Document doc = Jsoup.connect("https://www.codechef.com/users/"+cchandle).get();
        
        Elements temp = doc.select("div.rating-ranks");
        
        String S,k=null;
        
        
        for(Element abc:temp){
        S= abc.getElementsByTag("a").text();
        int p=S.indexOf(" ");
      k=  S.substring(p+1);
        }
        return k; 
        
    }
    
   
    
    public int spoj() throws IOException
       {
    
             Document doc = Jsoup.connect("http://www.spoj.com/users/"+spojhandle+"/").get();
        Elements temp = doc.select("p");
        int i =1;
        String str = null;
        int p =0;
        for(Element abc:temp)
        {
            if(i==3)
                str=abc.getElementsByTag("p").text();
            i++;
        }
        p = str.indexOf(" ");
        str=str.substring(p+1);
        p=str.indexOf(" ");
        str = str.substring(p+2);
        p=str.indexOf(" ");
        str=str.substring(0,p);
        //System.out.println(str);
        int k = Integer.parseInt(str);
        //System.out.println(k);
        
        return k;
    }
    
    public String codeforces() throws IOException
    {
        Document doc = Jsoup.connect("http://codeforces.com/profile/"+cfhandle).get();
        Elements abc=doc.select("span");
        String p = abc.get(24).text();
        return p;
    }
    
    
    
    
   
    
    
    @Override
    public void run(){
        
       
    try {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishkar", "root","rohit@dell1");
           // String p = spoj();
            int s = spoj();
            int cc = Integer.parseInt(codeforces());
            int cf = Integer.parseInt(codechef());
            PreparedStatement stmt =  conn.prepareStatement("insert into rank values(?,?,?,?)");
            stmt.setString(1,useremail);
            stmt.setInt(2,s);
            stmt.setInt(3,cc);
            stmt.setInt(4,cf);
            stmt.executeUpdate();
            
            
            
            
            //   System.out.println("kun");
        } catch (SQLException | IOException ex) {
            Logger.getLogger(web.class.getName()).log(Level.SEVERE, null, ex);
        }
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(web.class.getName()).log(Level.SEVERE, null, ex);
    }
    
   
     
    
        
    }
    
    
    
    
    
}
