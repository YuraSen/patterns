package prototype;

public class HumanFactory {
    Human human;


    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public HumanFactory() {

    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    Human makeCopy(){
        return (Human)human.copy();
    }


}
