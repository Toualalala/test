package org.groupmavinichi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//Component annotation for beans the name of bean for PersonIntro is ---> personIntro [1st letter is decapitalized]
public class PersonIntro {
    @Autowired
//   Autowired creates a default instance of TutturuClass instead of leaving tutturu as null thing in PersonIntro class
    private TutturuClass tutturu;
    private String name;

    public PersonIntro(){
        name = "";
    }
    public PersonIntro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[Name:"+name + " | Tu->"+tutturu+"]";
    }
}
