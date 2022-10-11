package ClassObjects;

public class Student implements StudentInterface {

    String name;
    int id;
    int units;

    public Student(String n, int i){
        name = n;
        id = i;
        units = 0;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public int getUnits(){
        return units;
    }

    public void incrementUnits(int k){
        units += k;
    }

    public boolean hasEnoughUnits(){
        if (units >= 180){
            return true;
        }
        return false;
    }

    public String toString(){
        return name + " (#" + String.valueOf(id) + ")";
    }

}
