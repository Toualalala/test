package org.groupmavinichi;


import org.springframework.stereotype.Component;

@Component
public class TutturuClass implements SoundInterface {

    @Override
    public String toString() {
        return "Tutturu!!!!!!";
    }

    public void MakeSound(){
        System.out.println("tutturu!");
    }


}
