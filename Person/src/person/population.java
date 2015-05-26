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
public class population {
    population(){
        
    }
    Person[] people = new Person[100000];
    private static int personIndex = 0;
    void addPerson(Person nextPerson){
        people[personIndex] = nextPerson;
        personIndex++;
    }
}
