public class BuildDroids {
    String name;
    int batteryLevel;

    //constructor for the class with parameter of String droidName
    BuildDroids(String droidName){
        name = droidName;
        batteryLevel =100;
    }

    //toString method
    public String toString(){
        return "Hello I am droid : " + name;
    }

    //Perform Task method
    public void performTask(String task){
        batteryLevel -= 10;
        System.out.println(name + " is performing task " + task);
    }
    public static void main(String[] args){
    BuildDroids codey = new BuildDroids("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("coding");
    }
}
