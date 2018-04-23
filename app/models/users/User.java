package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {
        @Id 
        private String email;

        @Constraints.Required
        private String role;

        @Constraints.Required
        private String name;

        @Constraints.Required
        private String password;

        // Default constructor
        public User() {      
        }

        public  User(String email, String role, String name, String password) {
            this.email = email;
            this.role = role;
            this.name = name;
            this.password = password;
        }
        //user unique id 
        public static Finder<String, User> find = new Finder<String, User>(User.class);
        

        
        //find users in db
        public static List<User> findAll(){
            return User.find.all();
        }

        
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public void setRole(String role) {
            this.role = role;
        }
    
        public String getRole() {
            return role;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getPassword() {
            return password;
        }
    
        public void setPassword(String password) {
            this.password = password;
        }
    

        //auth usern pass
        //returns if found
        public static User authenticate(String email, String password){
            return find.query().where().eq("email", email).eq("password", password).findUnique();
        }

        public static User getUserById(String id) {
            if (id == null)
                return null;
            else
                return find.byId(id);
        }
    }