package src.by.teachmeskills.human;

import src.by.teachmeskills.human.jacket.IJacket;
import src.by.teachmeskills.human.pants.IPants;
import src.by.teachmeskills.human.shoes.IShoes;

public class Human implements IHuman{

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public IJacket getJacket(){return jacket;}

    public void setJacket(IJacket jacket){
        this.jacket = jacket;
    }

    public IPants getPants(){return pants;}

    public void setPants(IPants pants){
        this.pants = pants;
    }

    public IShoes getShoes(){return shoes;}

    public void setShoes(IShoes shoes){
        this.shoes = shoes;
    }


    public Human(){}

    @Override
    public void dress() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void unDress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
