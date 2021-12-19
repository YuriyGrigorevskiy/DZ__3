package model;

import animals.Animal;
import java.util.HashMap;

public class Aviary <T extends Animal> {
    private  Size size;

    public Aviary(Size size){
        this.size=size;
    }

    public HashMap <String, T > collections = new HashMap<>();

    public void addAnimal(String name, T animal){
            if(size.equals(animal.getSize()))
        collections.put(name, animal);
            else {
                throw new WrongSizeException("WrongFoodException");}
    }


    public void getAnimal(String name){
        System.out.println(collections.get(name));
    }

    public boolean removeAnimal(String name){
        if (collections.containsKey(name)){
            collections.remove(name);
            return true;
        }else{
            return false;
        }
    }
}
