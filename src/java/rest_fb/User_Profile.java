
package rest_fb;
public class User_Profile {
	private String user_name;
        private String id;
        private String email;
        private String picture;
           private String link;
           private String token;
           
           
    public String getEmail() {
        return email;
    }
    
    public String getToken(){
        return token;
    }
    public void setToken(String token){
        this.token = token;
    }
    
public String getLink(){
    return link;
}
    public void setLink(String link){
        this.link= link;
    }
    public void setEmail(String email) {
        this.email = email;
    }
        
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
        
}