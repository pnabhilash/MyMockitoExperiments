package com.pabs.app.service;

public class BusinessImpl {



    private DataService dataService;

    public int calculate(int[] data){
        int sum=0;
        for(int value:data){
            sum+=value;
        }
        return  sum;
    }

    public int calculateSumFromDataService(){
        int sum=0;

        int data[]=dataService.retriveAllData ();
        for(int value:data){
            sum+=value;
        }
        return  sum;
    }

    public void setDataService (DataService dataService) {
        this.dataService = dataService;
    }


}
