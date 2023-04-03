package substitution_principle;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new  Office();
        build(building);
        //build(office);
    }

    private static void build(Building building) {
        System.out.println("Construting a new "+building.toString());

    }
    static void  printBuildings(List<Building> buildings){
        for(int i =0;i < buildings.size(); i++){
            System.out.println(i+1 +" : "+buildings.get(i).toString());
        }
    }
}
