package pojo.transport;


import javax.annotation.PostConstruct;

public abstract class Transport {
    @PostConstruct
    private void printReadyToWorkMessage(){
        System.out.println(this.getClass().getSimpleName() + " is ready to work");
    }
}
