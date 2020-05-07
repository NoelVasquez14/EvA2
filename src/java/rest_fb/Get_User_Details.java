
package rest_fb;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.json.JsonObject;
import java.util.Arrays;
public class Get_User_Details {
	public User_Profile Get_Profile_info(String accesstoken) {
            User_Profile obj_User_Profile = new User_Profile();
            try{
                
            
            FacebookClient facebookClient = new DefaultFacebookClient(accesstoken , Version.VERSION_2_6);
            
            JsonObject fetchObjectsResults =
                    facebookClient.fetchObjects(Arrays.asList("me"), 
                            JsonObject.class , Parameter.with("fields","name,id ,email,picture,link"));
                    System.out.println(fetchObjectsResults);
                    String temp= fetchObjectsResults.toString();
                    
         
                    
                    obj_User_Profile.setUser_name(temp.substring(temp.indexOf("\"name\":\"")+8, temp.indexOf("\",\"id\":\"")));
                    obj_User_Profile.setId(temp.substring(temp.indexOf(",\"id\":\"")+7, temp.indexOf("\",\"email\"")));
                    obj_User_Profile.setEmail(temp.substring(temp.indexOf(",\"email\":\"")+10, temp.indexOf("\",\"picture\":")));
                    obj_User_Profile.setPicture(temp.substring(temp.indexOf(",\"url\":\"")+7, temp.indexOf("\",\"width\":")));
                     obj_User_Profile.setToken(accesstoken);
		} catch(Exception e){
                    System.out.println(e);
                }
            return obj_User_Profile;
	}
}
