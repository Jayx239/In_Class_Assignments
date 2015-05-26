/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

/**
 *
 * @author Jason
 */
public class Person {
    Person(int index){
        Population[index] = this;
    }
    private static Person[] Population = new Person[100000];
    private double P = 0.3;
    private boolean infected = false;
    static int totalInfected = 0;
    public boolean isInfected(){
        return infected;
    }
    public void setInfected(int personInfecting){
        this.infected = true;
        this.incrementInfected();
        this.infect(personInfecting);
    }
    private void incrementInfected(){
        totalInfected++;
    }
    public void infect(int personInfecting){
        int nextInfected = -1;
        double roundVal = Math.random();
        int infectionRate;
        if(roundVal < P){
        infectionRate = (int)Math.ceil((5*P));    
        }
        else{
            infectionRate = (int)Math.floor((5*P));
        }
            // round up or down?
        for(int i=0; i<infectionRate;i++){
        nextInfected = -1;
            while(nextInfected <0 || nextInfected == personInfecting ){
        nextInfected = (int) (Math.random()*(100000-1));
            }
        if(!Population[nextInfected].isInfected()){
            Population[nextInfected].setInfected(nextInfected);
            System.out.println(nextInfected);
        }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<100000; i++){
            Person name = new Person(i);
    }
        int firstInfected = (int)Math.round((Math.random()*(100000-1)));
        System.out.println(firstInfected + " first infected");
        Person.Population[firstInfected].setInfected(firstInfected);
        System.out.println("The infected population is: " + Person.totalInfected + "\nPercent of population: " + ((double)Person.totalInfected/1000) + "%");
    }
    
}
