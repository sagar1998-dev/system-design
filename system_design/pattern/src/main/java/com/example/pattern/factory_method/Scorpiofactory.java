package com.example.pattern;

public class Scorpiofactory {

public scorpio Createscorpio(char type){

        switch (type) {
            case 'n': return new scorpioN();
            case 's' : return new scorpio();
            default: return new scorpio();
            
        }

}

    
}
