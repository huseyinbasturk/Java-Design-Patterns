package org.example;
abstract class AbstractDecorator  extends Component{
    protected Component com;

    public void setTheComponent(Component c){
        com = c;
    }

    public void doJob(){
        if(com != null){
            com.doJob();
        }
    }
}
class ConcreteDecorateEx_1 extends AbstractDecorator {
    public void doJob(){
        super.doJob();

        //add additional responsibilities
        System.out.println("I am explicitly from Ex_1");
    }
}

class ConcreteDecorateEx_2 extends AbstractDecorator {
    public void doJob(){
        System.out.println("");
        System.out.println("START Ex-2");
        super.doJob();

        //add additional responsibilities
        System.out.println("I am explicitly from Ex_2");
    }
}
