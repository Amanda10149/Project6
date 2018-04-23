package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Question extends Model {
    
    
    @Constraints.Required
    private String name;

    @Constraints.Required
    private String Email;

    @Constraints.Required
    private String Question;

    

    public Question() {
        
    }

    public Question (String name, String Email, String Question) {
        this.name = name;
        this.Email =Email;
        this.Question= Question;

    }
    public static final Finder<Long, Question> find = new Finder<>(Question.class);
    
        
        
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getQuestion() {
        return Question;
        }
        public void setQuestion(String Question) {
            this.Question = Question;
        }
        
        public String getEmail() {
            return Email;
        }
        public void setEmail(String Email) {
            this.Email = Email;
        }
    }