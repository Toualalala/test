package org.groupmavinichi;

import org.springframework.stereotype.Component;

@Component
public class LalalaClass implements SoundInterface{

   public void MakeSound(){
        System.out.println("Lalala!");
    }
}
